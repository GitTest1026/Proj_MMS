package mms.member.action;
//7.회원등록
import java.util.Scanner;

import mms.member.dao.MemberDAO;
import mms.member.db.JdbcUtil;
import mms.member.util.ConsoleUtil;
import mms.member.vo.Member;

public class MemberAddAction implements Action {
	MemberDAO dao = new MemberDAO(JdbcUtil.getConnection());
	@Override
	public void execute(Scanner sc) throws Exception {
		
	}

}
