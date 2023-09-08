package com.vj.lets.domain.location.mapper;

import com.vj.lets.domain.location.dto.SiDo;
import org.apache.ibatis.annotations.Mapper;

/**
 *  시, 도 매퍼
 *
 * @author 이희영
 * @version 1.0
 * @since 2023-09-08(008) (금)
 */
@Mapper
public interface SiDoMapper {

    /**
     * 시, 도 생성
     * @param siDoName
     */
    public void create(String siDoName);

    /**
     * 시, 도 이름으로 검색
     * @param siDoName
     * @return 시, 도
     */
    public SiDo findBySiDo(String siDoName);
}
