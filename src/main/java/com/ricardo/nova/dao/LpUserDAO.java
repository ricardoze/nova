package com.ricardo.nova.dao;

import com.ricardo.nova.model.LpUser;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * LpUserDAO继承基类
 */
@Mapper
@Repository
public interface LpUserDAO extends MyBatisBaseDao<LpUser, Integer> {
}