package com.vj.lets.domain.member.mapper;

import com.vj.lets.domain.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {

    public void create(Member member);

    public Member findByEmailAndPasswd(@Param("email") String email, @Param("password") String password);

    public List<Member> findByAll();

    public Member findById(int id);

    public void update(Member member);

    public void delete(int id);

}







