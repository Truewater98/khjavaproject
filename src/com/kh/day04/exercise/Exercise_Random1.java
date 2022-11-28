package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===== 동전 앞 뒤 맞추기 =====(종료는 -1 입력)");
			System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
			int choice = sc.nextInt();
			if(choice == -1) break;
			// computer 변수에는 1 또는 2의 값이 랜덤하게 들어가야함.
			int computer = rand.nextInt(2) + 1;
			if(choice != 1 && choice != 2) {
				System.out.println("2또는 1을 입력해주세요.");
			}
			else if (computer == choice)
				System.out.println("맞췄습니다.");
			else
				System.out.println("틀렸습니다.");
		}
	}
}
