package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {
	public static void main(String[] args) {
//		Exercise_Lotto lotto = new Exercise_Lotto();
//		lotto.Lotto();
		Person person = new Person();
		//person.name = "�Ͽ���";
		//person.jobName = "�ǻ�";
		// ���۷��� ���� ����
		// ���� ���� ����
		// �ּҰ� ����Ǵ� ����
		Rectangle rect = new Rectangle(); // ��ü����, �ݵ�� new Ű���� �̿�
		                                  // new�� ��ü�� ������ ȣ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʺ� �Է����ּ��� : ");
		// ��ü�� ��� ����(����� �����δ� ��� ������ ��� �޼ҵ�)
		// �ν��Ͻ�(Rectangle Ŭ������ ��ü)
		rect.width = sc.nextInt(); // ��ü�� ��� ������ ,���� �Ѵ�. ������� ����
		System.out.print("���̸� �Է����ּ��� : ");
		rect.height = sc.nextInt(); // ������� ����
		int result = rect.getArea(); // ����޼ҵ� ����
		System.out.print("�簢���� ������ : " + result);
	}

}
