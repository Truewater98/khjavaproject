package com.kh.practice.loop;

import java.util.Scanner;

public class Practice_for1 {
	public static void main(String[] arg) {
		//�� �Ƕ�̵� 4�� ������ĭ7ĭ
		/*    *
		 *   ***
		 *  *****
		 * ******* 
		 */
	   Scanner sc = new Scanner(System.in);
	   System.out.print("���� �Է� : ");
	   int floor = sc.nextInt();
	   for(int i = 0 ; i < floor; i++) {
		    int star = i * 2 + 1;
		    for(int e = 0 ; e < floor - i; e++) {
	    		System.out.print(" ");
	    	}
	    	for(int x = 0 ; x < star ; x++){
	    		System.out.print("*");
	    	}
	    	/*for(int e = 0 ; e < floor - i; e++) {
	    		System.out.print(" ");
	    	}*/
	    	System.out.println();
	    }
	}

}
