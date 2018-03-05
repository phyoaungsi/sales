package sg.edu.nus.iss.pmprs.business.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.constants.Gender;
import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.vo.MemberVo;


@Component
public class SearchMemberBl extends BusinessLogic<List<MemberVo>> {

	private static final String MEMBER_ID = "memberUserId";
	private static final String NAME = "name";
	private static final String NRIC = "nric";
	@Autowired PmprsMemberRepository memberRepository;

	
	@Override
	protected void execute(CommonVo v) {
		// TODO Auto-generated method stub
		
	//	memberRepository.find
		String field=getStringParam()[0];
		String keyword=getStringParam()[1];
		
		List<PmprsMember> members=	new ArrayList<PmprsMember>();
		keyword = "%" + keyword +"%";
		
		if(field.equals(MEMBER_ID)){
			 members=	memberRepository.findByMemberUserIdLike(keyword);
		}
		
		else if(field.equals(NAME)){
			members=	memberRepository.findByNameLike(keyword);
		}
        else if(field.equals(NRIC)){
        	members=	memberRepository.findByNricLike(keyword);
		}
		
		
		  List<MemberVo> vos=new ArrayList<MemberVo>();
		  for(PmprsMember m:members)
		  {
			MemberVo vo =new MemberVo();
			 vo.setAddress( m.getAddress());
			 if(m.getBirthDate()!=null)
			 {
			  vo.setBirthDate(m.getBirthDate().toString());
			 }
			 vo.setEmail( m.getEmail());
			 vo.setId( m.getId());
			 vo.setMemberUserId( m.getMemberUserId());
			 vo.setNric(m.getNric());
			 vo.setName(m.getName());
			 vo.setPostalCode(m.getPostalCode());
			 if(m.getGender())
			 {
				 vo.setGender(Gender.M.getName());
			 }
			 else
			 {
				 vo.setGender(Gender.F.getName());
			 }
			// vo.setStatus(m.getStatusId());
			 vos.add(vo);
	 
		  }
		setResult(vos);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
