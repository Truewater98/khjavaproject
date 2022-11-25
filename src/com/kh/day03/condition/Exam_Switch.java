package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Switch {
	public static void main(String[] args) {
		// 1. 입력
		// 2. 수정
		// 3. 조회
		// 4. 삭제
		// 0. 종료
		// 메뉴 번호를 입력하세요 : 3
		// 조회메뉴입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("입력메뉴입니다.");
			break;
		case 2:
			System.out.println("수정메뉴입니다.");
			break;
		case 3:
			System.out.println("조회메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 0:
			System.out.println("종료되었습니다.");
			break;
		default : 
			System.out.println("0 ~ 4 사이의 숫자를 입력해주세요.");
		}
		// 집에 가서 switch-case문으로 계산기 만들어보기!!
	}
//
}
