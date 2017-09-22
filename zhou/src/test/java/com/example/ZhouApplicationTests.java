package com.example;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhouApplicationTests {

	@Autowired
	UserMapper userMapper;
	private User user;

	@Test
	public void contextLoads() {
		user = userMapper.selectByPrimaryKey("1");
		System.out.println(user);
	}

}
