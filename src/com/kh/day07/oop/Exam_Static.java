package com.kh.day07.oop;

class StaticSample {
	public int num;

	public void sampleMethod() {
		input = 20;
	}

	public void goodMethod() {
		input = 30;
	}

	public static int input;

	public static void originMethod() {
		input = 5;
	}
}

public class Exam_Static {
	public static void main(String[] args) {
		new StaticSample().num = 10;
		StaticSample.input = 10;
		
		StaticSample s1;
		s1 = new StaticSample();
		System.out.println(s1.input);
		s1.originMethod();
		System.out.println(s1.input);
		int value = Math.abs(-5);
		System.out.println("�� : " + value);
	}
}
