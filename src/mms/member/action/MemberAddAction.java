package mms.member.action;
//7.ȸ�����
import java.util.Scanner;

import mms.member.vo.Member;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		Member m = new Member();
		System.out.println("����� ȸ�� ������ �Է��ϼ���");
		System.out.print("�̸� : ");
		m.setName(sc.next());
		System.out.println();
		System.out.print("�ּ� : ");
		m.setAddr(sc.next());
		System.out.println();
		System.out.print("���� : ");
		m.setNation(sc.next());
		System.out.println();
		System.out.print("�̸��� : ");
		m.setEmail(sc.next());
		System.out.println();
		System.out.print("���� : ");
		m.setAge(sc.nextInt());
	}

}
