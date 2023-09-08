package com.vj.lets.web.home.controller;

import com.vj.lets.domain.member.dto.LoginForm;
import com.vj.lets.domain.member.dto.Member;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 홈페이지 요청을 처리하는 세부 컨트롤러 구현 클래스
 *
 * @author 에너자이조 김기정
 * @version 1.0
 * @since 2023. 9. 4.
 */
@Controller
@RequestMapping("/")
@Slf4j
public class HomeController {

    @GetMapping("")
    public String home(HttpServletRequest request, Model model) {
        Member loginMember = null;

        HttpSession session = request.getSession();
        loginMember = (Member) session.getAttribute("loginMember");

        if (loginMember == null) {
            LoginForm loginForm = LoginForm.builder().build();
            model.addAttribute("loginForm", loginForm);
            return "index";
        }

        if (loginMember.getType().equals("admin")) {
            return "dashboard/admin/admin_dashboard";
        } else if (loginMember.getType().equals("host")) {
            return "dashboard/host/host_dashboard";
        } else {
            return "common/cafe/cafe_main";
        }

    }

}
