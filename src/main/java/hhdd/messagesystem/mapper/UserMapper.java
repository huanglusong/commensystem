package hhdd.messagesystem.mapper;

import hhdd.messagesystem.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findOndeById(int id);
}
