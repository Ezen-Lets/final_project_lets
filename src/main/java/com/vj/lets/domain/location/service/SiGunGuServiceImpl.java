package com.vj.lets.domain.location.service;

import com.vj.lets.domain.location.dto.SiDo;
import com.vj.lets.domain.location.dto.SiGunGu;
import com.vj.lets.domain.location.mapper.SiDoMapper;
import com.vj.lets.domain.location.mapper.SiGunGuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SiGunGuServiceImpl implements SiGunGuService {

    private final SiDoMapper siDoMapper;
    private final SiGunGuMapper siGunGuMapper;

    @Override
    public void register(String siDoName, SiGunGu siGunGu) {
        if (siDoMapper.findBySiDo(siDoName) == null) {
            siDoMapper.create(siDoName);
        }
        SiDo siDo = siDoMapper.findBySiDo(siDoName);
        siGunGu.setSiDoId(siDo.getId());
        siGunGuMapper.create(siDo.getName(), siGunGu);
    }

    @Override
    public SiGunGu findBySiGunGu(String siGunGuName) {
        return siGunGuMapper.findBySiGunGu(siGunGuName);
    }
}
