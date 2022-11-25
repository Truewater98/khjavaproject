package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_if {
	public static void main(String[] args) {
		// indent 정리 : ctrl + shift + f 
		// 정수 하나를 입력받아서 양의 정수인지, 0인지, 음의 정수인지
		// 판별하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력해주세요. :");
		int input = sc.nextInt();
		String result = "";
		if(input > 0) 
			result = "양의 정수";
		else if(input < 0) 
			result = "음의 정수";
		else 
			result = "0";
		System.out.println("입력하신 정수는 " + result +"입니다.");				
	}

}
