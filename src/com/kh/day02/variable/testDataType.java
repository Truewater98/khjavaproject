package com.kh.day02.variable;

public class testDataType {
	public static void main(String[] args) {
		//자료형 변수명 대입연산자 데이터 ;
		// 1. 자료형의 종류
		// 정수, 문자열  
		// int , String
		// 정수part
		byte bNum = 127; // -128~127
		short sNum = 32767; // -32768~32767
		int iNum = 2147483647; // -2147483648~2147483648
		long lNum = 2147483648l; // 접미사 l을 붙여야함.
		// 실수part
		float fNum = 22.1123f; // 접미사 f를 붙여야함.
		double dNum = 23.502; // 평균 구할 때 쓸 것.
		// 문자part
		char fChar = 'A'; // 홑따옴표 안에는 1개의 문자
		String sChar = "Hello Java"; // 쌍따옴표 안에는 여러개 문자
		// boolean형
		boolean result = false;
		// 1>0 , 2<1
		System.out.println("정수의 값 :" + iNum);
		System.out.println("정수의 값(9999억) : " + lNum);
		System.out.println("실수의 값 : " + fNum);
		System.out.println("실수의 값 : " + dNum);
		System.out.println("문자의 값 : " + fChar);
		System.out.println("문자열의 값 : " + sChar);
		System.out.println("논리의 값 : " + result);
		
		fChar = 65;
		System.out.println("문자에 숫자 : " + fChar);
		fChar = 75;
		System.out.println("문자에 숫자2 : " + fChar);
		// ASCII(아스키코드) 코드
		// -> 문자(char)는 숫자를 저장할 수 있고 ASCII코드에
		// 매핑되어있는 문자로 출력이 가능하다.
		
	}

}
