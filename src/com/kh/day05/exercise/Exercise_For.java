package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// 누적합
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}

	public void exercise2() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}

	public void exercise3() {
		// 구구단 출력하기!
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
	}

	public void exercise4() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요. : ");
		int num = sc.nextInt();
		if (num >= 1 && num <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		} else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}
	}
}
