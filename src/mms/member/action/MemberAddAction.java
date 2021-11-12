package mms.member.action;
//7.회원등록
import java.util.Scanner;

import mms.member.dao.MemberDAO;
import mms.member.db.JdbcUtil;
import mms.member.svc.MemberAddService;
import mms.member.util.ConsoleUtil;

public class MemberAddAction implements Action {
	private ConsoleUtil cu;
	private MemberDAO md;
	private MemberAddService as;
	
	public MemberAddAction() {
		cu = new ConsoleUtil();
		md = new MemberDAO(JdbcUtil.getConnection());
		as = new MemberAddService();
	}
	@Override
	public void execute(Scanner sc) throws Exception {
		cu.getNewMember(sc);
	}

}
