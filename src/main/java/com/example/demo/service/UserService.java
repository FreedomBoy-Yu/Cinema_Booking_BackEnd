package com.example.demo.service;

import java.util.List;

//import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

//import java.util.List;

public interface UserService {
	void addUser(User user);
	List<User> AllUser();
}
