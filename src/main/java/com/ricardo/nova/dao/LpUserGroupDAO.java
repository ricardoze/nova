package com.ricardo.nova.dao;

import com.ricardo.nova.model.LpUserGroup;
import org.springframework.stereotype.Repository;

/**
 * LpUserGroupDAO继承基类
 */
@Repository
public interface LpUserGroupDAO extends MyBatisBaseDao<LpUserGroup, Integer> {
}