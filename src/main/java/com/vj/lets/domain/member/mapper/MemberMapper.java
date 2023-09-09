package com.vj.lets.domain.member.mapper;

import com.vj.lets.domain.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Member 매퍼 인터페이스
 *
 * @author 김종원
 * @version 1.0
 * @since 2023-09-08 (금)
 */
@Mapper
public interface MemberMapper {

    public void create(Member member);

    public Member findByEmailAndPasswd(@Param("email") String email, @Param("password") String password);

    public List<Member> findByAll();

    public Member findById(int id);

    public void update(Member member);

    public void delete(int id);

}







