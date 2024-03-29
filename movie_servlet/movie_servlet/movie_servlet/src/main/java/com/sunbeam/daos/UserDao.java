package com.sunbeam.daos;

import java.util.List;

import com.sunbeam.pojos.Users;

public interface UserDao {
	public int save(Users u) throws Exception;
	public int update(Users u) throws Exception;
	public int updatePassword(int userId, String newPassword) throws Exception;
	public Users findByEmail(String email) throws Exception ;
	public List<Users> findAll() throws Exception;
}
