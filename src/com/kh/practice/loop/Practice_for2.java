package com.kh.practice.loop;

import java.util.Scanner;

public class Practice_for2 {
	public static void main(String[] args) {
       /*������ ���� ���� ������ �����ϼ���.

		ex.

		���� �Է� : 5

		 *****
		*     *
		*     *
		*     *
		 *****
	   */
	System.out.print("���� �Է� : ");
	Scanner sc = new Scanner(System.in);
	
	int floor = sc.nextInt();
	
	for(int i = 0; i < floor ; i++) {
		if(i == 0 || i == floor - 1 ) {
			System.out.print(" ");
			for(int j = 0 ; j < floor ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}else {
			System.out.print("*");
			for(int x = 0 ; x < floor ; x++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
			
	}
	
	}
	

}
