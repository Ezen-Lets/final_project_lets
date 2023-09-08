package com.vj.lets.domain.member.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberHistory {
    private int id;
    private String status;
    private String modifyDate;
    private int memberId;
}
