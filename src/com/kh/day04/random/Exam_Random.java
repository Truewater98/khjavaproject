package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			// nextInt(n) -> 0���� n-1������ ������ �� ����
			// 1���� 10������ �� �߿��� ������ ���� �̰� ������
			// nextInt(10)+1, �� +1�� ������ �����Ѵ�!!
			System.out.println(rand.nextInt(10)+1);
			// ex. 20���� 35������ �� �߿��� ������ ���� �̰� �ʹٸ�???
			// nextInt(??)+?? �ؾ��ұ��?
			System.out.println(rand.nextInt(16)+20);
		}
	}
}
