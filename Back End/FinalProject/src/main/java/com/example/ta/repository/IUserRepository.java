package com.example.ta.repository;

import java.util.List;

import com.example.ta.model.User;

public interface IUserRepository {
	public User insertUser(User user);
	public List<User> getAllUser();
	public User updateUser(int id, User user);
	public User getUserEmail(String email);
	public User getUserEmailPass(User user);
}
