

package sg.edu.nus.iss.pmprs.business.member;



import java.text.Format;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.constants.Gender;
import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.vo.MemberVo;


@Component
public class SearchByMememberNRICBl extends BusinessLogic<MemberVo> {

	
	private static final String NRIC = "nric";
	@Autowired PmprsMemberRepository memberRepository;

	
	@Override
	protected void execute(CommonVo v) {
		// TODO Auto-generated method stub
		try{
		
	//	memberRepository.find
		String field=getStringParam()[0];
		String keyword=getStringParam()[1];
		
		PmprsMember member=	new PmprsMember();
		
         if(field.equals(NRIC)){
        	member=	memberRepository.findByNric(keyword);
		}
		
		
         MemberVo vo =new MemberVo();
		  if (member != null)

		  {
			
			 vo.setAddress( member.getAddress());
			 if(member.getBirthDate()!=null)
			 {
				 Format formatter = new SimpleDateFormat("MM/dd/yyyy");
				 String s = formatter.format(member.getBirthDate());
				 vo.setBirthDate(s);
			 }
			 vo.setEmail( member.getEmail());
			 vo.setId( member.getId());
			 vo.setMemberUserId( member.getMemberUserId());
			 vo.setNric(member.getNric());
			 vo.setName(member.getName());
			 vo.setPostalCode(member.getPostalCode());
			 if(member.getGender())
			 {
				 vo.setGender(Gender.M.getName());
			 }
			 else
			 {
				 vo.setGender(Gender.F.getName());
			 }
			// vo.setStatus(m.getStatusId());
		
	 
		  }
		  	setResult(vo);
		}
		
		catch(Exception ex){
			System.out.println(ex.toString());
			//return null;
		}
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
