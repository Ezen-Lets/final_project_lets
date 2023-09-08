package com.vj.lets.domain.location.service;

import com.vj.lets.domain.location.dto.SiGunGu;

public interface SiGunGuService {

    public void register(String siDoName, SiGunGu siGunGu);

    public SiGunGu findBySiGunGu(String siGunGuName);
}
