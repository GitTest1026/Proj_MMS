package mms.member.util;

import java.util.ArrayList;
import java.util.Scanner;

import mms.member.vo.Member;

public class ConsoleUtil {
	public Member getNewMember(Scanner sc) {
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
		return new Member();
	}

	public void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + " ȸ�� ���� �߰� ����");
	}

	public void printAddFailMessage(Member newMember) {
		System.out.println(newMember.getName() + " ȸ�� ���� �߰� ����");
	}

	public void printMemberList(ArrayList<Member> memberList) {
		// size() : �÷��ǿ� ����Ǿ� �ִ� ����� ������ �����ϴ� �޼ҵ�
	}

	public String getName(String msgKind, Scanner sc) {
		return null;
	}

	public Member getUpdateMember(Scanner sc, Member oldMember) {
		return null;
	}

	public void printModifySuccessMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " ȸ�� ���� ���� ����.");
	}

	public void printModifyFailMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " ȸ�� ���� ���� ����.");
	}

	public void printRemoveSuccessMessage(String name) {
		System.out.println(name + " ȸ���� ���� ���� ����.");
	}

	public void printRemoveFailMessage(String name) {
		System.out.println(name + " ȸ���� ���� ���� ����.");
	}

}
