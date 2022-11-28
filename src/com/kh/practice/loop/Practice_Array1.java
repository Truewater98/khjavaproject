package com.kh.practice.loop;

import java.util.Scanner;

public class Practice_Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("숫자 하나를 입력하세요 : " );
		num = sc.nextInt();
		boolean sosu = true;
		while(num < 2) {
			System.out.println("숫자 : " + num);
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("숫자 하나를 입력하세요 : " );
			num = sc.nextInt();
			
		}
		for(int i = 2; i < num; i++) {
			int TF = num % i;
			if(TF == 0) {
			   sosu = false;
			   break;
			}
		}
		System.out.println("숫자 : " + num);
		if(sosu) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
