package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i < 101) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
	}

}
