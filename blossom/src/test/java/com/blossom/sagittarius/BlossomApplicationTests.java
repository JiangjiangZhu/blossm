package com.blossom.sagittarius;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.blossom.sagittarius.dao.RoleDao;
import com.blossom.sagittarius.dao.UserDao;
import com.blossom.sagittarius.domain.UserDO;
import com.blossom.sagittarius.domain.security.Role;
import com.blossom.sagittarius.domain.security.UserRole;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlossomApplicationTests {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RoleDao roleDao;

	@Test
	public void contextLoads() {
		
	}

}


