package mms.member.ui;

import java.util.Scanner;

import mms.member.action.MemberAddAction;
import mms.member.controller.MemberController;
import mms.member.svc.MemberAddService;
import mms.member.util.ConsoleUtil;

public class MemberUI {
	public static void main(String[] args) {
		boolean isStop = false;
		MemberController memberController = new MemberController();
		Scanner sc = new Scanner(System.in);
		String menu = "=====ȸ������ ���α׷�=====\n"
				+ "1. ȸ�����\n"
				+ "2.ȸ����Ϻ���\n"
				+ "3.ȸ����������\n"
				+ "4.ȸ����������\n"
				+ "5.���α׷�����";
		do {
			System.out.println(menu);
			System.out.print("�޴� ��ȣ : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				MemberAddService add = new MemberAddService();
				add.addMember(null)
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				isStop = true;
			}
		} while(!isStop);
	}
}
