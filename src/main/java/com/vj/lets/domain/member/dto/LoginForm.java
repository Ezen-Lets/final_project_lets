package com.vj.lets.domain.member.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

/**
 * 로그인 폼 클래스
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
public class LoginForm {
    @NotBlank(message = "이메일을 입력해 주세요")
    private String email;
    @NotBlank(message = "비밀번호를 입력해 주세요")
    private String password;
    private Boolean remember;
}





