package com.kh.day05.array;

public class Exam_SortInsertion {
	// ���� �˰���
	// 1. ��������
	// 2. ��������
	// 3. ��������
	// ���������̶�?
	// ���� �˰��� �߿� �ϳ��̸鼭 ���� �����ϰ� �⺻�� �Ǵ� �˰���
	// �迭�� n�� �ε������� 0������ n-1�� �ε������� ��!!!
	// {2, 5, 4, 1, 3}
	/*
	 * i = 0 2, 5, 4, 1, 3 // 1��° ���
	 * i = 1 
	 * 2, 5, 4, 1, 3 
	 * 2, 4, 5, 1, 3 // 2��° ���
	 * i = 2
	 * 2, 4, 1, 5, 3
	 * 2, 1, 4, 5, 3 
	 * 1, 2, 4, 5, 3 // 3��° ��� 
	 * i = 3 
	 * 1, 2, 4, 3, 5 
	 * 1, 2, 3, 4, 5
	 * 1, 2, 3, 4, 5
	 * 1, 2, 3, 4, 5 // 4��° ���
	 */
	public static void main(String[] args) {
		int[] array = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
