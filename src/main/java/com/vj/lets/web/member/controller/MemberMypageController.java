package com.vj.lets.web.member.controller;

import com.vj.lets.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 회원 마이페이지 요청 컨트롤러
 *
 * @author 김종원
 * @version 1.0
 * @since 2023-09-08 (금)
 */
@Controller
@RequestMapping("/mypage")
@RequiredArgsConstructor
@Slf4j
public class MemberMypageController {

    private final MemberService memberService;

    /**
     * 마이페이지 화면 출력
     *
     * @param model 객체 모델
     * @return 논리적 뷰 이름
     */
    @GetMapping("")
    public String registerForm(Model model) {
        return "dashboard/member/member_mypage";
    }

}
