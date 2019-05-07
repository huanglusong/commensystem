package hhdd.messagesystem.controller;

import hhdd.messagesystem.bean.User;
import hhdd.messagesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService service;

@RequestMapping("/find/{id}")
    public User findOneById(@PathVariable(value = "id")int id){
        return service.findOneById(id);
    }

}
