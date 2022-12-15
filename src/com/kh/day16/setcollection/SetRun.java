package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
	public static void main(String[] args) {
		// Collection의 List, Set, Map 저장소의 역할을 한다
		// 임시 또는 영구적으로 저장을 함
		// 자료구조의 특성에 따라서 List, Set, Map을 선택하여 쓸 수 있음.
		SetRun run = new SetRun();
		run.setExample2();
	}
	
	public void setExample1() {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		System.out.println("저장된 데이터의 수 : " + set.size());
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		set.add("one"); // 중복을 허용하지 않음.
		Iterator<String> iterator2 = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator2.next());
		}		
	}
	
	public void setExample2() {
		Set<Integer> set2 = new HashSet<Integer>();
//		set2.add(11);
//		set2.add(23);
		Set<Student> set3 = new HashSet<Student>();
		Student kdw = new Student("강동원", 35, 100);
		set3.add(new Student("정우성", 55, 70));
		set3.add(new Student("소지섭", 60 ,80));
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		
		System.out.println(kdw.toString());
//		System.out.println(new Student("강동원", 35, 100).hashCode());
//		System.out.println(new Student("강동원", 35, 100).hashCode());
//		System.out.println(new Student("강동원", 35, 100).hashCode());
	}
}

