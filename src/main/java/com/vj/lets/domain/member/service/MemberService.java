package com.vj.lets.domain.member.service;

import java.util.List;

import com.vj.lets.domain.member.dto.Member;

/**
 * 회원 관련 비즈니스 로직 처리 및 트랜잭션 관리
 */
public interface MemberService {
	
	public void register(Member member);
	public Member isMember(String email, String password);
	public List<Member> getMemberList();
	public Member getMember(int id);
	public void editMember(Member member);
	public void deleteMember(int id);

}
