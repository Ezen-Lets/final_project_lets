package com.vj.lets.domain.location.mapper;

import com.vj.lets.domain.location.dto.SiGunGu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *  시, 군, 구 매퍼
 * 
 * @author 이희영
 * @version 1.0
 * @since 2023-09-08(008) (금)
 */
@Mapper
public interface SiGunGuMapper {

    /**
     * 시, 군, 구 생성
     * @param siDoName
     * @param siGunGu
     */
    public void create(@Param("siDoName") String siDoName, @Param("siGunGu") SiGunGu siGunGu);

    /**
     * 시, 군, 구 이름으로 찾기
     * @param siGunGuName
     * @return 시, 군, 구
     */
    public SiGunGu findBySiGunGu(String siGunGuName);
}
