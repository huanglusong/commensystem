package hhdd.messagesystem.service.impl;

import hhdd.messagesystem.bean.User;
import hhdd.messagesystem.mapper.UserMapper;
import hhdd.messagesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;


    @Override
    public User login(String username, String password) {
        return mapper.findOndeById(username,password);
    }

    @Override
    public boolean register(String username, String password) {
        try{
            mapper.addUser(username,password);
            return true;
        }catch (Exception e){
            System.out.println("注册失败！！");
            return false;
        }

    }
}
