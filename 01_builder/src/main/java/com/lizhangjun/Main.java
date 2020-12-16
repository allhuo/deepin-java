package com.lizhangjun;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.ParameterMap;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //Student o = (Student) sqlSession.selectOne("selectById", 1);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student o = mapper.selectBlog(1);
        System.out.println(o.toString());

    }
}
