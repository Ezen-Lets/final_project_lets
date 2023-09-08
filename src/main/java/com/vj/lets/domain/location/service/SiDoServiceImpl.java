package com.vj.lets.domain.location.service;

import com.vj.lets.domain.location.dto.SiDo;
import com.vj.lets.domain.location.mapper.SiDoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SiDoServiceImpl implements SiDoService {

    private final SiDoMapper siDoMapper;

    @Override
    public void register(String siDoName) {
        siDoMapper.create(siDoName);
    }

    @Override
    public SiDo findBySiDo(String siDoName) {
        return siDoMapper.findBySiDo(siDoName);
    }
}
