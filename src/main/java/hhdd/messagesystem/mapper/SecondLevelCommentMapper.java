package hhdd.messagesystem.mapper;

import hhdd.messagesystem.bean.SecondLevelComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SecondLevelCommentMapper {

    public void insertSlcComment(SecondLevelComment secondLevelComment);
    public void deleteSlcComment( @Param("commentId") int commentId,@Param("sayingId") int sayingId);
}
