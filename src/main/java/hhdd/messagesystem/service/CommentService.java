package hhdd.messagesystem.service;

import hhdd.messagesystem.bean.FirstLevelComment;
import hhdd.messagesystem.bean.SecondLevelComment;

public interface CommentService {
    public void addFlcComment(FirstLevelComment firstLevelComment);

    public void removeFlcComment(int commentId, int sayingId);

    public void addSlcComment(SecondLevelComment secondLevelComment);

    public void removeSlcComment(int commentId, int sayingId);
}
