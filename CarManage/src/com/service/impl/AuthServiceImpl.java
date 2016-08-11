package com.service.impl;

import java.util.List;

import com.dao.AuthDao;
import com.model.Auth;
import com.service.AuthService;

public class AuthServiceImpl implements AuthService {
	public AuthDao authDao;
	public boolean addAuth(Auth auth){
		return authDao.addAuth(auth);
	}
	public boolean delAuth(Auth auth){
		return authDao.delAuth(auth);
	}
	public boolean updateAuth(Auth auth){
		return authDao.updateAuth(auth);
	}
	public List<Auth> queryAuth(){
		return authDao.queryAuth();
	}
	//------------set And get--------------//
	public AuthDao getAuthDao() {
		return authDao;
	}
	public void setAuthDao(AuthDao authDao) {
		this.authDao = authDao;
	}
	
}
