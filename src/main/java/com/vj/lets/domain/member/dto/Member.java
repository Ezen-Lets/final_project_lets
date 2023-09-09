package com.vj.lets.domain.member.dto;

import lombok.*;

/**
 * Member DTO 클래스
 *
 * @author 김종원
 * @version 1.0
 * @since 2023-09-08 (금)
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Member {
    private int id;
    private String email;
    private String name;
    private String password;
    private String phoneNumber;
    private String gender;
    private int age;
    private String type;
    private String regdate;
    private String imagePath;
}





