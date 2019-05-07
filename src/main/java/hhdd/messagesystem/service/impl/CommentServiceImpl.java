package hhdd.messagesystem.service.impl;

import hhdd.messagesystem.bean.FirstLevelComment;
import hhdd.messagesystem.bean.SecondLevelComment;
import hhdd.messagesystem.mapper.FirstLevelCommentMapper;
import hhdd.messagesystem.mapper.SecondLevelCommentMapper;
import hhdd.messagesystem.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private FirstLevelCommentMapper flcmapper;
    @Autowired
    private SecondLevelCommentMapper slcmapper;

    @Override
    public void addFlcComment(FirstLevelComment firstLevelComment) {
        flcmapper.insertFlcComment(firstLevelComment);
    }

    @Override
    public void removeFlcComment(int commentId, int sayingId) {
            flcmapper.deleteFlcComment(commentId,sayingId);
    }

    @Override
    public void addSlcComment(SecondLevelComment secondLevelComment) {
        slcmapper.insertSlcComment(secondLevelComment);
    }

    @Override
    public void removeSlcComment(int commentId, int sayingId) {
            slcmapper.deleteSlcComment(commentId,sayingId);
    }
}
