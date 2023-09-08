package com.vj.lets.web.member.controller;

import com.vj.lets.domain.member.dto.Member;
import com.vj.lets.domain.member.dto.LoginForm;
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
@RequestMapping("/member")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/register")
    public String registerForm(Model model) {
        RegisterForm registerForm = RegisterForm.builder().build();
        model.addAttribute("registerForm", registerForm);
        return "common/member/register";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute RegisterForm registerForm, BindingResult bindingResult, HttpServletResponse response, Model model) {
        Member member = Member.builder()
                .email(registerForm.getEmail())
                .name(registerForm.getName())
                .password(registerForm.getPassword())
                .build();
        memberService.register(member);

        try {
            response.setContentType("text/html; charset=utf-8");
            PrintWriter w = response.getWriter();
            w.write("<script>alert('회원가입이 완료되었습니다.');location.href='/member/login';</script>");
            w.flush();
            w.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        LoginForm loginForm = LoginForm.builder().build();
        model.addAttribute("loginForm", loginForm);
        return "common/member/login";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute LoginForm loginForm, BindingResult bindingResult, HttpServletRequest request, Model model) {

        if (bindingResult.hasErrors()) {
            return "redirect:/member/login";
        }

        // 데이터 검증 정상 처리 시
        Member loginMember = memberService.isMember(loginForm.getEmail(), loginForm.getPassword());

        if (loginMember == null) {
            bindingResult.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            return "redirect:/member/login";
        }

        // 회원인 경우 세션 생성 및 로그인 아이디 설정
        HttpSession session = request.getSession();
        session.setAttribute("loginMember", loginMember);

        return "redirect:/";

    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 세션이 있으면 기존 세션 반환, 없으면 생성하지 않고 null 반환
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/";
    }

}
