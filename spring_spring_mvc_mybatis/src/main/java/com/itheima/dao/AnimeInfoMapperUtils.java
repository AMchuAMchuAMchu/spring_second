package com.itheima.dao;

import com.itheima.dao.AnimeInfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 15:48:14
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Repository
public class AnimeInfoMapperUtils {

    /**
    * Description ==> TODO
    * Return Type ==> com.itheima.dao.AnimeInfoMapper
    * Params args ==> []
    * Create Time ==> 2022/10/11 15:56
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    public AnimeInfoMapper getMapper() {

        InputStream ras = null;
        try {
            ras = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(ras);

        SqlSession sqlSession = build.openSession();

        AnimeInfoMapper mapper = sqlSession.getMapper(AnimeInfoMapper.class);

        return mapper;

    }

}
