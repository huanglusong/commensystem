package hhdd.messagesystem.service;

import hhdd.messagesystem.bean.User;

public interface UserService {

    User login(String username,String password);
    boolean register(String username,String password);

}
