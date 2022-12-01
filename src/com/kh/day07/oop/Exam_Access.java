package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10; //접근가능하다 public이니까
		//aClass.b = 10; // is not visible, 불가능하다 private이니까
		aClass.c = 10; //접근가능하다. default니까
	}
}
