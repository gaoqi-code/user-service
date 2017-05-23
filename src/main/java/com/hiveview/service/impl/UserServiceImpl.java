package com.hiveview.service.impl;


import com.hiveview.dao.UserDao;
import com.hiveview.entity.User;
import com.hiveview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gonglixun on 2017/2/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public int updateUser(){
        return 1;
    }

    @Override
    public User addUser(String openid, String unionid, int parentId, int agentId){
        User user = new User();
        user.setOpenid(openid);
        user.setUnionid(unionid);
        user.setParentId(parentId);
        user.setLevel(1);
        user.setAgentId(agentId);
        userDao.addUser(user);
        return user;
    }
    @Override
    public User getUserByUnionid(String unionid){
        return userDao.getUserByUnionid(unionid);
    }

    @Override
    public User getUserByParentId(int parentId){
        return null;//userDao.getInfoById("UserDao.getUserByParentId",parentId);
    }

    @Override
    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public int updateUserBalance(int userId,BigDecimal totalFee,int dataType,String dataDesc,boolean isJia){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userId",userId);
        map.put("money",totalFee);
        map.put("dataType",dataType);
        map.put("dataDesc",dataDesc);
        userDao.addUserBalanceLog(map);
        if(isJia){
            return userDao.updateUserJiaBalance(userId,totalFee);
        }else {
            return userDao.updateUserJianBalance(userId,totalFee);
        }
    }
}
