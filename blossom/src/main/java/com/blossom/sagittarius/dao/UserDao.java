package com.blossom.sagittarius.dao;


import org.apache.ibatis.annotations.Mapper;
import com.blossom.sagittarius.domain.UserDO;

@Mapper
public interface UserDao {
	
    UserDO getByUsername(String username);
    
}
