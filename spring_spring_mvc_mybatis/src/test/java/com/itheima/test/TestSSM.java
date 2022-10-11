package com.itheima.test;

import com.alibaba.fastjson2.JSON;
import com.itheima.dao.AnimeInfoMapper;
import com.itheima.dao.AnimeInfoMapperUtils;
import com.itheima.pojo.AnimeInfo;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 15:58:05
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Repository
public class TestSSM {

//    static{
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
//    }




    @Test
    public void testSelectById(){

        AnimeInfoMapper mapper = AnimeInfoMapperUtils.getMapper();

        List<AnimeInfo> animeInfos = mapper.selectAnimeById(24);

        Object o = JSON.toJSON(animeInfos);


        System.out.println(o);


    }

    @Test
    public void testUpdate02(){

        AnimeInfoMapper mapper = AnimeInfoMapperUtils.getMapper();
        AnimeInfo animeInfo = new AnimeInfo();
        animeInfo.setName("Darling in the FRANxx ClowerWorks");
        animeInfo.setCharacter01("zero two户松遥");
        animeInfo.setCharacter02("广上村佑翔");
        animeInfo.setId(24);
        mapper.updateAnime(animeInfo);


    }




    @Test
    public void testUpdate(){

        AnimeInfoMapper mapper = AnimeInfoMapperUtils.getMapper();
        AnimeInfo animeInfo = new AnimeInfo();
        animeInfo.setName("Darling in the FRANxx");
        animeInfo.setCharacter01("zero two");
        animeInfo.setCharacter02("sixteenth");
        animeInfo.setId(24);
        animeInfo.setReleaseTime(2018);
        mapper.updateAnime(animeInfo);


    }




    @Test
    public void testInsert(){
        AnimeInfoMapper mapper = AnimeInfoMapperUtils.getMapper();

        AnimeInfo animeInfo = new AnimeInfo();

        animeInfo.setName("Darling in the FRANxx");
        animeInfo.setCharacter01("zero two");
        animeInfo.setCharacter02("sixteenth");
        animeInfo.setId(24);
        animeInfo.setReleaseTime(2020);

        mapper.insertAnime(animeInfo);

    }

    @Test
    public void testDelete(){

        AnimeInfoMapper mapper = AnimeInfoMapperUtils.getMapper();


        mapper.deleteAnime(24);

    }



    @Test
    public void testSelect(){

//
//        AnimeInfoMapperUtils bean = ac.getBean(AnimeInfoMapperUtils.class);
//
//        AnimeInfoMapper mapper = bean.getMapper();


        AnimeInfoMapper mapper = AnimeInfoMapperUtils.getMapper();
        List<AnimeInfo> animeInfos = mapper.selectAnime(null);

        animeInfos.forEach(System.out::println);


    }

}
