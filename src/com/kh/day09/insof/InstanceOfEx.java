package com.kh.day09.insof;

public class InstanceOfEx {

	static void print(Person p) {
//		person p = new Student();
//		if(p instanceof Person)
//			System.out.println("Person입니다!");
		if(p instanceof Student)
			System.out.println("Student입니다!");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다!");
		if(p instanceof Professor)
			System.out.println("Professor입니다!");
	}
	
	public static void main(String[] args) {
//		print(new Person());
		//person p = new Student();
		print(new Student());
		//상속 안할시 나는 오류
		//The method print(Person) in the type InstanceOfEx is not applicable for the arguments (Student)
		print(new Researcher());
		print(new Professor());
	}
}
