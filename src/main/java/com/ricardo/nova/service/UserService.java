package com.ricardo.nova.service;

import com.ricardo.nova.dao.LpUserDAO;
import com.ricardo.nova.model.LpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private LpUserDAO lpUserDAO;

    public LpUser getUserById(Integer id){
        return lpUserDAO.selectByPrimaryKey(id);
    }
    public List<LpUser> getAllUser(){
        return lpUserDAO.selectAll();
    }
}
