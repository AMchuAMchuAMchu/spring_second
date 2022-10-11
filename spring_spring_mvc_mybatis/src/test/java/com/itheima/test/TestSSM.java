package com.itheima.test;

import com.itheima.dao.AnimeInfoMapper;
import com.itheima.dao.AnimeInfoMapperUtils;
import com.itheima.pojo.AnimeInfo;
import com.itheima.pojo.SayHello;
import com.itheima.springconfig.SpringConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 15:58:05
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public class TestSSM {

//    static{
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
//    }


    @Autowired
    private SayHello sayHello;

    @Test
    public void testAnime(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        SayHello bean = ac.getBean(SayHello.class);

        bean.printHello();

        sayHello.printHello();

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
