package com.vj.lets.web.common.interceptor;

import com.vj.lets.domain.member.dto.LoginForm;
import com.vj.lets.domain.member.dto.Member;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 로그인 모달창 인터셉터 구현
 * 
 * @author 김종원
 * @version 1.0
 * @since 2023-09-08 (금)
 */
@Slf4j
public class LoginModalInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		String rememberEmail = null;
		if (session.getAttribute("loginMember") == null) {
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equalsIgnoreCase("remember")) {
						rememberEmail = cookie.getValue();
					}
				}
			}
			LoginForm loginForm = LoginForm.builder().build();
			if (rememberEmail != null) {
				loginForm.setEmail(rememberEmail);
				loginForm.setRemember(true);
			}
			request.setAttribute("loginForm", loginForm);
		}
		return true;
	}

}

