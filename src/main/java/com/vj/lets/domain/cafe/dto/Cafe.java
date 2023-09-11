package com.vj.lets.domain.cafe.dto;

import lombok.*;

/**
 *Cafe dto
 *
 * @author VJ특공대 강소영
 * @version 1.0
 * @since 2023. 9. 7.
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Cafe {
    private int id;
    private String email;
    private String name;
    private String phoneNumber;
    private String detailAddress;
    private int latitude;
    private int longitude;
    private int roomCount;
    private int startTime;
    private int endTime;
    private String description;
    private String imagePath;
    private String regdate;
    private int businessNumber;
    private int siGunGuId;
    private int memberId;
    private String roadAddress;
}