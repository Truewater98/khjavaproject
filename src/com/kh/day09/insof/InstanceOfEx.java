package com.kh.day09.insof;

public class InstanceOfEx {

	static void print(Person p) {
//		person p = new Student();
//		if(p instanceof Person)
//			System.out.println("Person�Դϴ�!");
		if(p instanceof Student)
			System.out.println("Student�Դϴ�!");
		if(p instanceof Researcher)
			System.out.println("Researcher�Դϴ�!");
		if(p instanceof Professor)
			System.out.println("Professor�Դϴ�!");
	}
	
	public static void main(String[] args) {
//		print(new Person());
		//person p = new Student();
		print(new Student());
		//��� ���ҽ� ���� ����
		//The method print(Person) in the type InstanceOfEx is not applicable for the arguments (Student)
		print(new Researcher());
		print(new Professor());
	}
}
