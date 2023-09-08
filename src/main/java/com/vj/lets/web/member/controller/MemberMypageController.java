package com.vj.lets.web.member.controller;

import com.vj.lets.domain.member.dto.LoginForm;
import com.vj.lets.domain.member.dto.Member;
import com.vj.lets.domain.member.dto.RegisterForm;
import com.vj.lets.domain.member.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;

@Controller
@RequestMapping("/member/mypage")
@RequiredArgsConstructor
@Slf4j
public class MemberMypageController {

    private final MemberService memberService;

    @GetMapping("")
    public String registerForm(Model model) {
        return "dashboard/member/member_mypage";
    }

}
