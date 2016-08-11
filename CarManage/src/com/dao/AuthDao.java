package com.dao;

import java.util.List;

import com.model.Auth;

public interface AuthDao {
	public boolean addAuth(Auth auth);
	public boolean delAuth(Auth auth);
	public boolean updateAuth(Auth auth);
	public List<Auth> queryAuth();
}
