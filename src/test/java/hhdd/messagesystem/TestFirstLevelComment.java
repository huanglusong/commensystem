package hhdd.messagesystem;

import hhdd.messagesystem.bean.FirstLevelComment;
import hhdd.messagesystem.mapper.FirstLevelCommentMapper;
import hhdd.messagesystem.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MessgesystemApplication.class)
public class TestFirstLevelComment {
    @Autowired
    private FirstLevelCommentMapper mapper;
    @Autowired
    private CommentService service;

    @Test
    public void testInsert(){
        FirstLevelComment flc = new FirstLevelComment();
        flc.setSayingId(2);
        flc.setAvatar("nihao");
        flc.setCommentContent("insert a flc");
        flc.setCommenter("huanghedidi222");
        flc.setCommentTime(new Date());
        mapper.insertFlcComment(flc);
        //试着获取主键
        int key = flc.getId();
        System.out.println("获得的主键是"+key);
    }

    @Test
    public void testDelete(){
        mapper.deleteFlcComment(1,1);}


     @Test
    public void testDeleteSlc(){
        service.removeSlcComment(5,1);
     }
}
