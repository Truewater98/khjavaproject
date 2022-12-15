package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList; 
	
	public MemberController() {
		mList = new ArrayList<Member>();
	}
	
	public void registerMember(Member member) {
		mList.add(member);
	}
	
	public List<Member> printAllMember() {
		return mList;
	}
	
	public int findMemberId(String memberId) {
		for(int i =0; i < mList.size(); i++) {
			// memberId와 같은 데이터가
			// mList에 있는지 찾아보기!
			Member mOne = mList.get(i);
			// 넘겨받은 memberId가 mOne에 있는지 확인
			if(memberId.equals(mOne.getMemberId())) {
				return i;
			}
		}
		return -1;
	}
	// 리턴된 인덱스값을 이용하여 데이터 찾기
	public Member printOneByIndex(int index) {
		Member memberName = mList.get(index);
		return memberName;
	}
	
	public int findMemberName(String memberName) {
		for(int i = 0; i < mList.size(); i++) {
			 if(memberName.equals(mList.get(i).getMemberName())) {
				 return i;
			 }
		}
		return -1;
	}
	// 같은 값이 있을 때 해당 객체 리턴
//	public Member findMemberId(String memberId) {
//		for(int i = 0; i < mList.size(); i++) {
//			Member mOne = mList.get(i);
//			if(memberId.equals(mOne.getMemberId())) {
//				return mOne;
//			}
//		}
//		return null;
//	}
	public Member printOneByNameIndex(int index) {
		Member member = mList.get(index);
		return member;
	}
}
