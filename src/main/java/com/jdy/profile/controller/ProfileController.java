package com.jdy.profile.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdy.profile.dao.MemberDao;

import jakarta.servlet.http.HttpServletRequest;

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
	
	// 수업 여기까지
	
	@GetMapping(value = "/join")
	public String join() {
		return "join";
	}
	
	@PostMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		memberDao.joinMemberDao(mid, mpw, mname, memail);
		
		model.addAttribute("mid", mid);
		model.addAttribute("mpw", mpw);
		
		return "joinOk";
	}
	
	
}
