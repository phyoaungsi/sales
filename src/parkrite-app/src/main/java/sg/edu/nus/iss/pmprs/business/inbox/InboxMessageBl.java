package sg.edu.nus.iss.pmprs.business.inbox;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsInboxMessageRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsInboxMessage;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;

@Component
public class InboxMessageBl extends BusinessLogic<List<PmprsInboxMessage>> {


	@Autowired PmprsInboxMessageRepository messageRepository;
	@Autowired PmprsMemberRepository memberRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		String userId=getStringParam()[0];
		PmprsMember member=memberRepository.findByMemberUserId(userId);
		if(member!=null){
		setResult(messageRepository.findByMemberIdOrderByCreatedTimeDesc(member.getId()));
		}
	}

	
	public void createMessage(String title,String message, Integer memberId){
		
		PmprsInboxMessage inbox=new PmprsInboxMessage();
		inbox.setMemberId(memberId);
		inbox.setMessage(message);
		inbox.setTitle(title);
		messageRepository.save(inbox);
		
	}
	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
