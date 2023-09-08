package com.vj.lets.domain.location.service;

import com.vj.lets.domain.location.dto.SiDo;

public interface SiDoService {

    public void register(String siDoName);

    public SiDo findBySiDo(String siDoName);
}
