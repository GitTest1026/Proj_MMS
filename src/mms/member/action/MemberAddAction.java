package mms.member.action;
//7.ȸ�����
import java.util.Scanner;

import mms.member.vo.Member;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		Member m = new Member();
		System.out.println();
		m.setId(sc.nextInt());
		m.setName(sc.next());
	}

}
