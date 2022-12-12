package com.kh.day14.listcollection;

public class Run {
	public static void main(String[] args) {
		ObjectList objList = new ObjectList();
		objList.add(11);
		objList.add("월");
//		objList.add(23);
//		objList.add("일");
		objList.add(new Student());
		int num = (int)objList.get(0);
		String str = (String)objList.get(1);
		Student stu = (Student)objList.get(2);
	}
	
	public void intExample() {
		//int[] nums = new int[3];
		Intlist nums = new Intlist();
//		nums[0] = 1;
		nums.add(1);
//		nums[1] = 2;
		nums.add(2);
//		nums[2] = 3;
		nums.add(3);
//		nums[3] = 4;
		nums.add(4);
		System.out.println("1번째 값 : " + nums.get(0));
		System.out.println("2번째 값 : " + nums.get(1));
		System.out.println("3번째 값 : " + nums.get(2));
		System.out.println("4번째 값 : " + nums.get(3));
		System.out.println("크기 : " + nums.size());
		nums.clear();
		System.out.println("삭제 후 크기 : " + nums.size());
	}
}
