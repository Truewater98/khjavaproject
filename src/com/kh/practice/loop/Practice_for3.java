package com.kh.practice.loop;

import java.util.Scanner;

public class Practice_for3 {
	public static void main(String[] args) {
		//for�� ���̾Ƹ��
		Scanner sc = new Scanner(System.in);
		System.out.print("Ȧ�� �Է� : ");
		int floor = sc.nextInt();
		int yaho = floor / 2 + 1;
		if(floor % 2 == 1) {
			//i�� ������ -1
		    for(int i = 0 ; i < floor ; i++) {
		       int maxstar = 1 + 2 * i;
		       int minstar = (1 + 2 * yaho) - (2 + 2 * (i-(floor - yaho)));
			   if(i < yaho ){
		          for(int j = 0; j < floor - i ; j++) {
			         System.out.print(" ");
			   }
			      for(int j = 0 ; j < maxstar ; j++) {
				     System.out.print("*");
			   }
			   /*   for(int j = 0; j < floor - i ; j++) {
				     System.out.print(" ");
			   }*/
			      System.out.println("");
			   }
			   else {
				  for(int j = 0 ; j < i + 1 ; j++ ) {
					  System.out.print(" ");
				  }
				  for(int j = 0; j < minstar; j++) {
					  System.out.print("*");
				  }
				/*  for(int j = 0 ; j < i + 1 ; j++ ) {
					  System.out.print(" ");
				  }*/
				  System.out.println("");
			   }
		    }//floor - n 
		}
		else {
			System.out.println("Ȧ�� �ƴ�.");
		}
	}

}
