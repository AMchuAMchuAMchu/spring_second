package com.itheima.dao;


import jdk.nashorn.internal.objects.NativeInt8Array;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-12 05:14:06
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeInfoMapperUtils {

    /**
    * Description ==> TODO
    * Return Type ==> com.itheima.dao.AnimeInfoMapper
    * Params args ==> []
    * Create Time ==> 2022/10/12 5:16
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    public static AnimeInfoMapper getAnimeMapper() {

        InputStream ras = null;
        try {
            ras = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(ras);

        SqlSession sqlSession = build.openSession(true);

        AnimeInfoMapper mapper = sqlSession.getMapper(AnimeInfoMapper.class);

        return mapper;


    }

}
