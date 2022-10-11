package com.itheima.test;

import com.itheima.dao.AnimeInfoMapper;
import com.itheima.dao.AnimeInfoMapperUtils;
import com.itheima.pojo.AnimeInfo;
import com.itheima.springconfig.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 15:58:05
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class TestSSM {


    @Test
    public void testInsert(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        AnimeInfoMapperUtils bean = ac.getBean(AnimeInfoMapperUtils.class);

        AnimeInfoMapper mapper = bean.getMapper();

        List<AnimeInfo> animeInfos = mapper.selectAnime(null);

        animeInfos.forEach(System.out::println);


    }

}
