package com.example.demo02;

import com.example.demo02.customconfig.MyProperties;
import com.example.demo02.configbean.Person;
import com.example.demo02.configbean.Student;
import com.example.demo02.configbean.User;
import com.example.demo02.mybatiscatalog.Comment;
import com.example.demo02.mybatiscatalog.CommentMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MavenDemo01ApplicationTests {
    @Autowired
    Demo02Application demo02Application;
    @Autowired
    Student student;

    @Value("${student.id}")
    int id;

    @Autowired
    User user;

    @Autowired
    Person person;
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void contextLoads() {
        /*System.out.println("单元测试返回的student数据---" + student);
        System.out.println("元测试返回的id数据---" + id);
        System.out.println("元测试返回的user数据----"+user);
        System.out.println("元测试返回的person数据----"+person);*/
        /*String result = con.hello();
        System.out.println("��Ԫ���Է��ص�����---"+con.hello());
        System.out.println("��Ԫ���Է��ص�student����----"+stu);*/
        MyProperties myProperties = (MyProperties) applicationContext.getBean("xmlProperties1");
        if (myProperties !=null){
            myProperties.getResult();
        }

        Comment comment=commentMapper.findById(1);
        System.out.println(comment.getaId());
    }

}
