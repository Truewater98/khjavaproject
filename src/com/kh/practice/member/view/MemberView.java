package com.kh.practice.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

public class MemberView {
	//======= ȸ������ ���α׷� =======
	//	1. ȸ������ ��ü��ȸ
	//	2. ȸ�� ���̵�� ��ȸ
	//	3. ȸ�� �̸����� ��ȸ
	//	4. ȸ������
	//	5. ȸ������ ����
	//	6. ȸ��Ż��
	//	0. ���α׷� ����
	//	�޴� ���� :
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= ȸ������ ���α׷� =======");
		System.out.println("1. ȸ������ ��ü��ȸ");
		System.out.println("2. ȸ�� ���̵�� ��ȸ");
		System.out.println("3. ȸ�� �̸����� ��ȸ");
		System.out.println("4. ȸ������");
		System.out.println("5. ȸ������ ����");
		System.out.println("6. ȸ��Ż��");
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴� ���� : ");
		int value = sc.nextInt(); 
		return value;
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String memberId = sc.next();
		System.out.print("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.print("�̸� : ");
		String memberName = sc.next();
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		System.out.print("���� : ");
		String memberGender = sc.next();
		System.out.print("�̸��� : ");
		String memberEmail = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.print("�ּ� : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.print("��� : ");
		String memberHobby = sc.next();
		Member member = new Member();
		member.setMemberAddress(memberAddress);
		member.setMemberAge(memberAge);
		member.setMemberEmail(memberEmail);
		member.setMemberGender(memberGender);
		member.setMemberHobby(memberHobby);
		member.setMemberId(memberId);
		member.setMemberName(memberName);
		member.setMemberPhone(memberPhone);
		member.setMemberPwd(memberPwd);
		return member;
	}
	
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� ���̵� �Է� : ");
		String memberId = sc.next();
		return memberId;
	}
	
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === ȸ������ ��ü��ȸ === === ===");
		for(Member mOne : mList) {
			System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
			System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
			System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
			System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
			System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
			System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
			System.out.println("ȸ�� �ּ� : " + mOne.getMemberAddress());
			System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");
		}
	}
	
	public void printOneById(Member mOne) {
		System.out.println(mOne.toString());
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� �Է� : ");
		String memberName = sc.next();
		return memberName;
	}
	
	public void printOneByName(Member mOne) {
		System.out.println(mOne.toString());
	}
}
