package com.example.ta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ta.model.User;
import com.example.ta.repository.IUserRepository;
import com.example.ta.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.insertUser(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.getAllUser();
	}

	@Override
	public User updateUser(int id, User user) {
		// TODO Auto-generated method stub
		return userRepository.updateUser(id, user);
	}

	@Override
	public User getUserEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.getUserEmail(email);
	}

	@Override
	public User getUserEmailPass(User user) {
		// TODO Auto-generated method stub
		return userRepository.getUserEmailPass(user);
	}



}
