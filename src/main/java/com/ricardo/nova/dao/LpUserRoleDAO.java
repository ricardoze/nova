package com.ricardo.nova.dao;

import com.ricardo.nova.model.LpUserRole;
import org.springframework.stereotype.Repository;

/**
 * LpUserRoleDAO继承基类
 */
@Repository
public interface LpUserRoleDAO extends MyBatisBaseDao<LpUserRole, Integer> {
}