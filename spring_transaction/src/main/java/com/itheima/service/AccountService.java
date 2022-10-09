package com.itheima.service;

import com.itheima.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.mapper.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-09 18:51:19
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AccountService {

    public void transfer(){
        InputStream ars = null;
        try {
            ars = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(ars);

        SqlSession sqlSession = build.openSession();

        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        mapper.insertAdd(100);

        mapper.insertSub(100);




    }

}
