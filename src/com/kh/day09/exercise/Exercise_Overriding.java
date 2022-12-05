package com.kh.day09.exercise;


class SuperClass {
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super object");
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}	
}

public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass(); // 업캐스팅
		ex.paint();
	}
}
