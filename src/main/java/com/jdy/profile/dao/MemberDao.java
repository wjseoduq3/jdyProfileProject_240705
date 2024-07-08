package com.jdy.profile.dao;

import java.util.ArrayList;

import com.jdy.profile.dto.MemberDto;

public interface MemberDao {
	
	public void joinDao(String mid, String mpw, String mname, String memail);
	public int idCheckDao(String mid);
	public int loginCheckDao(String mid, String mpw);
	public MemberDto getMemberInfoDao(String mid);
	
}
