package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise1() {
		int i = 1;
		int sum = 0;
		while (i < 101) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);

	}

	public void exercise2() {

		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요. : ");
		int i = sc.nextInt();
		int num = 1;
		while (num < 10) {
			System.out.println(i + " * " + num + " = " + i * num);
			num++;
		}
	}

	public void exercise3() {

		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 입력한 수의 합을 출력하시오
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 : 14
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 1;
		while (num != -1) {
			System.out.print("정수 하나 입력 : ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("입력하신 수의 합은 : " + sum);
	}
}
