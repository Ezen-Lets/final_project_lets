package com.vj.lets.domain.location.mapper;//import static org.junit.jupiter.api.Assertions.*;

import com.vj.lets.domain.location.dto.SiDo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class SiDoMapperTest {

    @Autowired
    private SiDoMapper siDoMapper;

    @Test
    @Transactional
    void createTest() {
        // given
        String siDoName = "제주도";
        // when
        siDoMapper.create(siDoName);
        // then
        log.info("시,도 정보 : {}", siDoName);
        assertThat(siDoName).isNotNull();
    }

    @Test
    @Transactional
    void findBySiDoTest() {
        // given
        String siDoName = "제주도";
        // when
        SiDo siDo = siDoMapper.findBySiDo(siDoName);
        // then
        log.info("시,도 정보 : {}", siDo);
        assertThat(siDo).isNotNull();
    }
}