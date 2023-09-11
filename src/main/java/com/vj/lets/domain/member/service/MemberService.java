package com.vj.lets.domain.member.service;

import com.vj.lets.domain.member.dto.Member;

import java.util.List;

/**
 * 회원 관련 비즈니스 로직 처리 및 트랜잭션 관리 서비스 인터페이스
 *
 * @author VJ특공대 김종원
 * @version 1.0
 * @since 2023-09-08 (금)
 */
public interface MemberService {

    /**
     * 회원 가입
     *
     * @param member 회원 정보
     */
    public void register(Member member);

    /**
     * 로그인 시 회원 조회
     *
     * @param email    이메일
     * @param password 비밀번호
     * @return 회원 정보
     */
    public Member isMember(String email, String password);

    /**
     * 전체 회원 목록 조회
     *
     * @return 회원 목록
     */
    public List<Member> getMemberList();

    /**
     * 특정 회원 정보 조회
     *
     * @param id 회원 아이디
     * @return 회원 정보
     */
    public Member getMember(int id);

    /**
     * 회원 정보 수정
     *
     * @param member 회원 정보
     */
    public void editMember(Member member);

    /**
     * 회원 탈퇴
     *
     * @param id 회원 ID
     */
    public void removeMember(int id);

}
