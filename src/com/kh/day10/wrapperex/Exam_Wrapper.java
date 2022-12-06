package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String[] args) {
		// Wrapper ��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
		Integer i = Integer.valueOf(1234);
		// ��ü�� ���� ����ϴٰ�
		int e = i.intValue();
		// �⺻������ ��ȯ����
		Integer f = null;
		// Type mismatch : cannot convert from null to int
		// int m = null;
		System.out.println(i);
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();
		
		// ���ڿ��� �⺻ ������ Ÿ�� ��ȯ(int, boolean, double)���� ��ȯ
		String a = "123";
		int num = Integer.parseInt(a);
		System.out.println("��ȯ�� �� : " + (a + 1));
		System.out.println("��ȯ�� �� : " + (num + 1));
		boolean isYn = Boolean.getBoolean("true");
		double fNum = Double.parseDouble("3.14");
		
		// �⺻ ������ Ÿ��(int, double, char)�� ���ڿ��� ��ȯ
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123);
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
		
	}
}
