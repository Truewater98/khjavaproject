package com.kh.practice.beayul;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Complex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		int size = 1;
		sc.nextLine();
		String[] array = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.print(size + "번째 문자열 : ");
			array[i] = sc.nextLine();
			size++;
		}
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char TF = sc.next().charAt(0);
			if (TF == 'Y' || TF == 'y') {
				System.out.print("더 입력하고 싶은 개수? : ");
				num = sc.nextInt();
				sc.nextLine();
				array = Arrays.copyOf(array, array.length + num);
				for (int i = 0; i < num; i++) {
					System.out.print(size + "번째 문자열 : ");
					array[size - 1] = sc.nextLine();
					size++;
				}

			} else if (TF == 'N' || TF == 'n') {
				break;
			}
		}
		    System.out.print("[" + array[0]);
		for (int i = 1; i < size - 1; i++) {
			System.out.print(", " + array[i]);
		}
	        System.out.println("]");
	}
}
