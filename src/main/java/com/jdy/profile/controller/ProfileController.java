package com.jdy.profile.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdy.profile.dao.MemberDao;
import com.jdy.profile.dto.MemberDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ProfileController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@GetMapping(value = "/")
	public String home() {		
		return "index";
	}
	
	@GetMapping(value = "/index")
	public String index() {		
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@GetMapping(value = "/join")
	public String join() {
		return "join";
	}
	
	@GetMapping(value = "/profile")
	public String profile() {
		return "profile";
	}
	
	@GetMapping(value = "/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping(value = "/write")
	public String write() {
		return "write";
	}
	
	@GetMapping(value = "/list")
	public String list() {
		return "boardlist";
	}
	
	@PostMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
				
		int idCheck = memberDao.idCheckDao(request.getParameter("mid"));
		// idCheck == 1이면 가입불가, 0이면 가입가능
		
		if(idCheck==1) {
			model.addAttribute("joinFail", 1);
			
		} else { // 가입성공
			memberDao.joinDao(request.getParameter("mid"), request.getParameter("mpw"), request.getParameter("mname"), request.getParameter("memail"));
			model.addAttribute("mid", request.getParameter("mid"));
			model.addAttribute("mname", request.getParameter("mname"));
			
		}
		return "joinOk";		
	}
	
	@PostMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, HttpSession session, Model model) {
		
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
				
		int loginCheck = memberDao.loginCheckDao(request.getParameter("mid"), request.getParameter("mid"));
		// idCheck == 1이면 가입불가, 0이면 가입가능
		
		MemberDto memberDto = null;
		
		if(loginCheck !=1) {
			model.addAttribute("loginFail", 1);
			
		} else { // 로그인 성공
			session.setAttribute("sessionId", request.getParameter("mid"));	
			memberDto = memberDao.getMemberInfoDao(request.getParameter("mid"));
						
			model.addAttribute("mname", memberDto.getMname());
			model.addAttribute("mdate", memberDto.getMdate());
			
		}
		return "loginOk";		
	}
	
	
}
