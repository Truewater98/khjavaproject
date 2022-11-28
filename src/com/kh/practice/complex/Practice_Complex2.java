package com.kh.practice.complex;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Complex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 : " );
		String input = sc.next();
		System.out.print("검색하실 문자를 입력해주세요 : ");
		char serch = sc.next().charAt(0);
	    int length = input.length();
	    int count = 0;
	    char[] inputa = new char[length];
	    int[] index = new int[0];
		for(int i = 0; i < length; i++ ) {
			inputa[i] = input.charAt(i);
		}
		for(int i = 0; i < length; i ++) {
			if(serch == inputa[i]) {
				count++;
				index = Arrays.copyOf(index, count);
				index[count - 1] = i;
			}
		}
		System.out.print(input + "에 " + serch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < count; i++) {
			System.out.print(index[i] + " ");
		}
		System.out.println();
		System.out.println(serch + " 개수 : " + count);
	}

}
