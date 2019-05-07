package hhdd.messagesystem.mapper;

import hhdd.messagesystem.bean.FirstLevelComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FirstLevelCommentMapper {

    public void insertFlcComment(FirstLevelComment firstLevelComment);
    public void deleteFlcComment(@Param("commentId") int commentId, @Param("sayingId") int sayingId);
}
