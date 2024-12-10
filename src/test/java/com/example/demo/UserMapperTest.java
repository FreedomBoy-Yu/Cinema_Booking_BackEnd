package com.example.demo;


import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class UserMapperTest {
	
    @Autowired
    private UserMapper userMapper;

    @Test
    public void UserTest() {
//    	userMapper.addUser(new User("5","5","5","5"));
		
//    	System.out.println(userMapper.findAllUser().size());
//    	System.out.println(userMapper.findById(3));
//    	userMapper.updateUser(new User(3,"6","6","6","56"));
    	userMapper.deleteUser(1);
    	System.out.println("success");
    }
}
