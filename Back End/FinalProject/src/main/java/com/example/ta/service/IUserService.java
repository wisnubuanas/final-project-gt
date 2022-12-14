package com.example.ta.service;

import com.example.ta.model.User;

import java.util.List;

public interface IUserService {
	public User insertUser(User user);
	public List<User> getAllUser();
	public User updateUser(int id, User user);
	public User deleteUser(int id);
	public User updateGetId(int id);
}
