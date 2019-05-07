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
    public User findOneById(int id) {
        return mapper.findOndeById(id);
    }
}
