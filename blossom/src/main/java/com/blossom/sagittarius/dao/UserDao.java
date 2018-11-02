package com.blossom.sagittarius.dao;


import org.apache.ibatis.annotations.Mapper;
import com.blossom.sagittarius.domain.UserDO;

@Mapper
public interface UserDao {
	
	void createUser(UserDO userDO);
	
    UserDO getByUsername(String username);
    
}
