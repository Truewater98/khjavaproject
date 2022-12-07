package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {
	public static void main(String[] args) {
		Integer num = Integer.valueOf(0);
		// Boxing(ÀÚµ¿ ¹Ú½Ì)
		Integer su = 100;
		
		int soo = num.intValue();
		// UnBoxing(ÀÚµ¿ ¾ð¹Ú½Ì)
		soo = num;
		
		int n = 10;
		Integer intObject = n ; // boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10; // unboxing
		System.out.println("m = " + m);
	}
}