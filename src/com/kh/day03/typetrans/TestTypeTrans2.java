package com.kh.day03.typetrans;

public class TestTypeTrans2 {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		//�ڵ� �� ��ȯ
		System.out.println(b+i);    // b�� int�� �ڵ�����ȯ
		System.out.println(10/4);  
		System.out.println(10.0/4); // 4�� 4.0(�Ǽ�)�� �ڵ�����ȯ
		//���� �� ��ȯ ->ū �ڷ����� ���� �ڷ������� ��ȯ, ������ �ս� �߻�!!
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 +1.8));
		System.out.println((int)2.9 + (int)1.8);
		
	}

}