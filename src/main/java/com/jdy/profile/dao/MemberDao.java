package com.jdy.profile.dao;

public interface MemberDao {
	
	public void joinDao(String mid, String mpw, String mname, String memail);
	public int idCheckDao(String mid);

}
