package com.vj.lets.domain.location.service;//import static org.junit.jupiter.api.Assertions.*;

import com.vj.lets.domain.location.dto.SiDo;
import com.vj.lets.domain.location.dto.SiGunGu;
import com.vj.lets.domain.location.mapper.SiDoMapper;
import com.vj.lets.domain.location.mapper.SiGunGuMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class SiGunGuServiceTest {

    @Autowired
    private SiDoService siDoService;
    @Autowired
    private SiGunGuService siGunGuService;

    @Test
    @Transactional
    void registerTest() {
        // given
        String siDoName = "광주광역시";
        if (siDoService.findBySiDo(siDoName) == null) {
            siDoService.register(siDoName);
        }
        SiDo siDo = siDoService.findBySiDo(siDoName);
        SiGunGu siGunGu = SiGunGu.builder()
                                 .name("어쩔군")
                                 .siDoId(siDo.getId())
                                 .build();
        // when
        siGunGuService.register(siDoName, siGunGu);
        // then
        log.info("시, 도 정도 : {}", siDo);
        log.info("시, 군, 구 정보 : {}", siGunGu);
        assertThat(siGunGu).isNotNull();
    }

    @Test
    @Transactional
    void findBySiGunGuTest() {
        // given
        String siGunGuName = "강북구";
        // when
        SiGunGu siGunGu = siGunGuService.findBySiGunGu(siGunGuName);
        // then
        log.info("시, 군, 구 정보 : {}", siGunGu);
        assertThat(siGunGu).isNotNull();
    }
}