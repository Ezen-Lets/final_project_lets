package com.vj.lets.domain.member.service;

import java.util.List;

import com.vj.lets.domain.member.dto.Member;

/**
 * 회원 관련 비즈니스 로직 처리 및 트랜잭션 관리 서비스 인터페이스
 *
 * @author 김종원
 * @version 1.0
 * @since 2023-09-08 (금)
 */
public interface MemberService {
	
	public void register(Member member);
	public Member isMember(String email, String password);
	public List<Member> getMemberList();
	public Member getMember(int id);
	public void editMember(Member member);
	public void deleteMember(int id);

}
