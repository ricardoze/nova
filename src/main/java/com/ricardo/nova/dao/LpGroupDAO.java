package com.ricardo.nova.dao;

import com.ricardo.nova.model.LpGroup;
import org.springframework.stereotype.Repository;

/**
 * LpGroupDAO继承基类
 */
@Repository
public interface LpGroupDAO extends MyBatisBaseDao<LpGroup, Integer> {
}