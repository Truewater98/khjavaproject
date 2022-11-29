package com.kh.day05.exercise;


import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하시오.
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 한 후 , for문을 활용해서 바나나가 있으면 바나나를 출력해보세요!
		String[] array = new String[5];
		array[0] = "딸기";
		array[1] = "복숭아";
		array[2] = "키위";
		array[3] = "사과";
		array[4] = "바나나";
		// 조금 더 편하게! -> 할당과 초기화 동시에!!
		String[] fruit = { "딸기", "복숭아", "키위", "사과", "바나나" };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == "바나나") {
				System.out.println("바나나");
			}
		}
	}

	public void exercise3() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 입력받은 값들의 평균을 구하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;
		System.out.print("양의 정수 5개를 입력해주세요 : ");
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("입력받은 값들의 평균은 : " + (double) sum / array.length);

	}

	public void exercise4() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 제일 큰 수를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개를 입력해주세요 : ");
		int[] array = new int[5];
		int max = 0;
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

	public void exercise5() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 210618-1124600 -> 210618-1******
		// 200518-3233920 -> 200518-3******
		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14];
		System.out.print("주민등록번호 입력(-포함) : ");
		String memberNum = sc.next();
		// String으로 입력받은 값을 하나씩 잘라서 origin 문자배열에 넣기!
		for (int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		// char[] copy = origin; // 얕은 복사, 이러면 의도한 것이 아니다!
		char[] copy = new char[14]; // 깊은 복사의 시작!
		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				copy[i] = origin[i];
			}
			else {			
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
		System.out.println();
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);
		}
	}
}

