package com.ricardo.nova.dao;

import com.ricardo.nova.model.LpUserRight;
import org.springframework.stereotype.Repository;

/**
 * LpUserRightDAO继承基类
 */
@Repository
public interface LpUserRightDAO extends MyBatisBaseDao<LpUserRight, Integer> {
}