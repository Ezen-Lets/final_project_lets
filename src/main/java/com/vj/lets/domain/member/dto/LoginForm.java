package com.vj.lets.domain.member.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

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





