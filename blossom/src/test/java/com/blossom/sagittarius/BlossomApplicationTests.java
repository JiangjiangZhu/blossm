package com.blossom.sagittarius;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.blossom.sagittarius.dao.UserDao;
import com.blossom.sagittarius.domain.UserDO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlossomApplicationTests {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void contextLoads() {
		System.out.println("Hello World!");
		UserDO userDO = userDao.getByUsername("zhu jiangjiang");		
		System.out.println(userDO.getPassword());
	}

}
