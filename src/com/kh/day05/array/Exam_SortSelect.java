package com.kh.day05.array;

public class Exam_SortSelect {
	public static void main(String[] args) {
		// �˰��� ����
		// 1. ��������
		// 2. ��������
		// 3. ��������
		// ���������̶�?
		// �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		// Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����������
		// ������ ���� ���� �� �ް��� ���� ���ϸ� ����.
		// �迭�� n�� �ε������� n+1 ~ ������ �ε������� ����.
		int[] array = {2, 5, 4, 1, 3};
		int min; // �ε����� ����
		for(int i = 0; i < array.length; i++) {
			min = i; // ���� ���� �� �ε��� ��
			for(int j = i+1 ; j < array.length; j++ ) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		for(int i = 0; i <array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
