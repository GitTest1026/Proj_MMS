package mms.member.svc;

import mms.member.dao.MemberDAO;
import mms.member.db.JdbcUtil;
import mms.member.vo.Member;

public class MemberAddService {
	public boolean addMember(Member newMember) throws Exception{
		MemberDAO dao = new MemberDAO(JdbcUtil.getConnection());
		dao.insertNewMember(newMember);
		
		//commit();
		return false;
	}

}
