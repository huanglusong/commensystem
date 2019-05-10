package hhdd.messagesystem.mapper;

import hhdd.messagesystem.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User findOndeById(@Param("username") String username, @Param("password") String password);

    void addUser(@Param("username") String username, @Param("password") String password);

}
