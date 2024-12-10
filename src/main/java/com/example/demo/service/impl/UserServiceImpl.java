package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper usermapper;
	
	@Override
	public void addUser(User user) {
		usermapper.addUser(user);
	}
    public List<User> AllUser() {
        return usermapper.findAllUser();
    }
    public User findById(int id){
		return usermapper.findById(id);
    	
    }
    public void updateUser(User user) {
    	usermapper.updateUser(user);
    }
    public void deleteUser(int id) {
    	usermapper.deleteUser(id);
    }

}
