package com.vj.lets.web.home.controller;

import com.vj.lets.domain.member.dto.Member;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 메인 인덱스 페이지 요청 컨트롤러
 * 
 * @author 김종원
 * @version 1.0
 * @since 2023-09-08 (금)
 */
@Controller
@RequestMapping("/")
@Slf4j
public class HomeController {

    @GetMapping("")
    public String home(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        Member loginMember = (Member) session.getAttribute("loginMember");
        if (loginMember == null) {
            return "index";
        }

        if (loginMember.getType().equals("admin")) {
            return "redirect:/admin";
        } else if (loginMember.getType().equals("host")) {
            return "redirect:/host";
        } else {
            return "redirect:/cafe";
        }

    }

    @GetMapping("host")
    public String hostHome(Model model) {
        return "dashboard/host/host_dashboard";
    }

    @GetMapping("admin")
    public String adminHome(Model model) {
        return "dashboard/admin/admin_dashboard";
    }

    @GetMapping("cafe")
    public String guestHome(Model model) {
        return "common/cafe/cafe_main";
    }

}
