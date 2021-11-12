package mms.member.action;
//7.회원등록
import java.util.Scanner;

import mms.member.vo.Member;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		Member m = new Member();
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("이름 : ");
		m.setName(sc.next());
		System.out.println();
		System.out.print("주소 : ");
		m.setAddr(sc.next());
		System.out.println();
		System.out.print("국가 : ");
		m.setNation(sc.next());
		System.out.println();
		System.out.print("이메일 : ");
		m.setEmail(sc.next());
		System.out.println();
		System.out.print("나이 : ");
		m.setAge(sc.nextInt());
	}

}
