package com.vj.lets.web.dashboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 관리자 대시보드 관련 요청 컨트롤러
 *
 * @author VJ특공대 김종원
 * @version 1.0
 * @since 2023-09-10 (일)
 */
@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
@Slf4j
public class AdminController {

    /**
     * 관리자 대시보드 메인 화면 출력
     *
     * @param model 모델 객체
     * @return 논리적 뷰 이름
     */
    @GetMapping("")
    public String adminMain(Model model) {
        return "dashboard/admin/admin_dashboard";
    }

    @GetMapping("/contact")
    public String contactView(Model model) {
        return "dashboard/admin/contacts";
    }

    @GetMapping("/faq/register")
    public String faqRegisterView(Model model) {
        return "dashboard/admin/faq_add";
    }

    @GetMapping("/faq")
    public String faqListView(Model model) {
        return "dashboard/admin/faq_list";
    }

    @GetMapping("/chart")
    public String chartView(Model model) {
        return "dashboard/admin/charts";
    }

    @GetMapping("/host")
    public String hostView(Model model) {
        return "dashboard/admin/hosts";
    }

    @GetMapping("/member")
    public String memberView(Model model) {
        return "dashboard/admin/members";
    }

}
