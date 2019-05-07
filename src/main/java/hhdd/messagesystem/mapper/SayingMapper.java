package hhdd.messagesystem.mapper;

import hhdd.messagesystem.bean.Saying;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SayingMapper {


    public Saying selectOneByIdSimple(int id);

    public Saying selectOneById(int id);

    public void updateLikesById(@Param("id") int id, @Param("likes") String likes);

}
