package com.vj.lets.domain.member.dto;

import lombok.*;

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





