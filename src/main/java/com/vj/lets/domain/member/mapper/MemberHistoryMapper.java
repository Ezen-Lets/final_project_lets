package com.vj.lets.domain.member.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * MemberHistory 매퍼 인터페이스
 *
 * @author 김종원
 * @version 1.0
 * @since 2023-09-08 (금)
 */
@Mapper
public interface MemberHistoryMapper {

    public void create();

    public void update(int memberId);

    public void delete(int memberId);

}







