package com.vj.lets.domain.member.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberHistoryMapper {

    public void create();

    public void update(int memberId);

    public void delete(int memberId);

}







