package com.kh.day09.overriding;

class SuperClass{
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass{
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}
}

public class Exam {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}
