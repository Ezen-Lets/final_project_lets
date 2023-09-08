package com.vj.lets.domain.member.service;

import java.util.List;

import com.vj.lets.domain.member.dto.Member;
import com.vj.lets.domain.member.mapper.MemberHistoryMapper;
import com.vj.lets.domain.member.mapper.MemberMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{
	
	private final MemberMapper memberMapper;
	private final MemberHistoryMapper memberHistoryMapper;

	@Override
	@Transactional
	public void register(Member member) {
		memberMapper.create(member);
		memberHistoryMapper.create();
	}

	@Override
	public Member isMember(String email, String password) {
		return memberMapper.findByEmailAndPasswd(email, password);
	}

	@Override
	public List<Member> getMemberList() {
		return memberMapper.findByAll();
	}

	@Override
	public Member getMember(int id) {
		return memberMapper.findById(id);
	}

	@Override
	@Transactional
	public void editMember(Member member) {
		memberMapper.update(member);
		memberHistoryMapper.update(member.getId());
	}

	@Override
	@Transactional
	public void deleteMember(int id) {
		memberMapper.delete(id);
		memberHistoryMapper.delete(id);
	}
}
