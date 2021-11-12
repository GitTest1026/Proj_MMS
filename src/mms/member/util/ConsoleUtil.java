package mms.member.util;

import java.util.ArrayList;
import java.util.Scanner;

import mms.member.vo.Member;

public class ConsoleUtil {
	public Member getNewMember(Scanner sc) {
		System.out.println("����� ȸ�� ������ �Է��ϼ���");
		// ����ڿ��� �Է¹��� �����͸� Member��ü�� ����
		Member mb = new Member();		
		System.out.print("�̸� : ");
		mb.setName(sc.next());
		System.out.println();
		System.out.print("�ּ� : ");
		mb.setAddr(sc.next());
		System.out.println();
		System.out.print("���� : ");
		mb.setNation(sc.next());
		System.out.println();
		System.out.print("�̸��� : ");
		mb.setEmail(sc.next());
		System.out.println();
		System.out.print("���� : ");
		mb.setAge(sc.nextInt());		
		return mb;
	}

	public void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + " ȸ�� ���� �߰� ����");
	}

	public void printAddFailMessage(Member newMember) {
		System.out.println(newMember.getName() + " ȸ�� ���� �߰� ����");
	}

	public void printMemberList(ArrayList<Member> memberList) {
		for (Member m : memberList) {
			m.toString();
		}
		// size() : �÷��ǿ� ����Ǿ� �ִ� ����� ������ �����ϴ� �޼ҵ�
	}

	public String getName(String msgKind, Scanner sc) {
		return null;
	}

	public Member getUpdateMember(Scanner sc, Member mb) {
		if(mb == null) {
			System.out.println("ȸ�������� �����ϴ�.");
			return mb;
		} else {
			System.out.println("������ ȸ�� ������ �Է��ϼ���");
			System.out.print("���� ���� : " + mb.getNation() + " ");
			System.out.print("������ ���� : ");
			mb.setNation(sc.next());
			System.out.print("���� �̸��� : " + mb.getEmail() + " ");
			System.out.print("������ �̸��� : ");
			mb.setEmail(sc.next());
			System.out.print("���� ���� : " + mb.getAge() + " ");
			System.out.print("������ ���� : ");
			mb.setAge(sc.nextInt());
			return mb;
		}
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
