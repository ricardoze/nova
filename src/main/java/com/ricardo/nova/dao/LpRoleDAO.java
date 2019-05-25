package com.ricardo.nova.dao;

import com.ricardo.nova.model.LpRole;
import org.springframework.stereotype.Repository;

/**
 * LpRoleDAO继承基类
 */
@Repository
public interface LpRoleDAO extends MyBatisBaseDao<LpRole, Integer> {
}