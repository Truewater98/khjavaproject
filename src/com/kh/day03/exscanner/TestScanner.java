package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("이름을 입력해주세요.");
		String name = sc.next();
		System.out.println("태어난 월을 입력해주세요.");
		int month = sc.nextInt();
		System.out.println("키를 입력해주세요.");
		double height = sc.nextDouble();
		System.out.println("성별을 입력해주세요.");
		char gender = sc.next().charAt(0);
		System.out.println("주소를 입력해주세요.");
		sc.nextLine(); //엔터 제거
		String adress = sc.nextLine();
		
		System.out.println();
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("성별은" + gender + "입니다.");
		System.out.println("주소는 " + adress + "입니다.");
	}

}
