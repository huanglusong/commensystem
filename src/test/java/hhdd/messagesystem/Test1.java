package hhdd.messagesystem;

import hhdd.messagesystem.bean.FirstLevelComment;
import hhdd.messagesystem.bean.Saying;
import hhdd.messagesystem.mapper.SayingMapper;
import hhdd.messagesystem.service.SayingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MessgesystemApplication.class)
public class Test1 {
    @Autowired
    private SayingMapper mapper;

    @Autowired
    private SayingService service;

    @Test
    public void test1(){
        Saying saying = mapper.selectOneByIdSimple(2);
        System.out.println(saying);
    }

    @Test
    public void test2(){
        Saying saying = mapper.selectOneById(1);
        System.out.println("==========说说内容==================");
        System.out.println(saying);
        List<FirstLevelComment>list = saying.getFlcs();
        for(FirstLevelComment flc:list){
            System.out.println(flc);
        }


    }
    @Test
    public void testUpdateLike(){
        mapper.updateLikesById(1,"15");
    }


    @Test
    public void testSayingService(){
        Saying saying = service.selectOneById(2);
        System.out.println(saying);
    }

}
