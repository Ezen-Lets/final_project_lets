package com.vj.lets.domain.member.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class RegisterForm {
	@NotBlank(message = "이메일을 입력해 주세요")
	private String email;
	@NotBlank(message = "비밀번호를 입력해 주세요")
	private String password;
	@NotBlank(message = "비밀번호 중복을 확인해 주세요")
	private String confirmPassword;
	@NotBlank(message = "이름을 입력해 주세요")
	private String name;
}





