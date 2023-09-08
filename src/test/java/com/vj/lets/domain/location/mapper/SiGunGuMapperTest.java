package com.vj.lets.domain.location.mapper;//import static org.junit.jupiter.api.Assertions.*;

import com.vj.lets.domain.location.dto.SiDo;
import com.vj.lets.domain.location.dto.SiGunGu;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class SiGunGuMapperTest {

    @Autowired
    private SiDoMapper siDoMapper;
    @Autowired
    private SiGunGuMapper siGunGuMapper;

    @Test
    @Transactional
    void createTest() {
        // given
        String siDoName = "제주도";
        SiDo siDo = siDoMapper.findBySiDo(siDoName);
        SiGunGu siGunGu = SiGunGu.builder()
                .name("제주시")
                .siDoId(siDo.getId())
                .build();
        // when
        siGunGuMapper.create(siDoName, siGunGu);
        // then
        log.info("시, 군, 구 정보 : {}", siGunGu);
        assertThat(siGunGu).isNotNull();
    }

    @Test
    @Transactional
    void findBySiGunGuTest() {
        // given
        String siGunGuName = "강북구";
        // when
        SiGunGu siGunGu = siGunGuMapper.findBySiGunGu(siGunGuName);
        // then
        log.info("시, 군, 구 정보 : {}", siGunGu);
        assertThat(siGunGu).isNotNull();
    }
}