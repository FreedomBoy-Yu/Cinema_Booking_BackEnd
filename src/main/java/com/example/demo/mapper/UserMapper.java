package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

@Mapper
public interface UserMapper {
	
	void addUser(User user);
	
	List<User> findAllUser();

	User findById(int id);

	void updateUser(User user);

	void deleteUser(int id);

}
