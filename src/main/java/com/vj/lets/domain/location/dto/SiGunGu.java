package com.vj.lets.domain.location.dto;

import lombok.*;

/**
 * 시, 군, 구 빈
 * 
 * @author 이희영
 * @version 1.0
 * @since 2023-09-08(008) (금)
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class SiGunGu {

    private int id;
    private String name;
    private int siDoId;
}
