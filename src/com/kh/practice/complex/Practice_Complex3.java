package com.kh.practice.complex;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Complex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���. : ");
		int num = sc.nextInt();
		int count = 1;
		int[] array = new int[1];
	    array[0] = 2;
		
	    System.out.println("���� : " + num);
	    for(int i = 2; i <= num; i++) {
	    	for(int j = 2; j < i;) {
	    		if(i % j == 0) {
	    			break;
	    		}else {
	    			array = Arrays.copyOf(array, array.length + 1);
	    			array[count] = i;
	    			count++;
	    			break;
	    		}
	    	}
	    }
       for(int i = 0; i < count; i++) {
    	   System.out.print(array[i]);
       }
       System.out.println();
       System.out.println("2���� " + num +"���� �Ҽ��� ������ " + count +"���Դϴ�.");
	}
}
