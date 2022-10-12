package com.itheima.controller;

import com.itheima.dao.AnimeInfoMapper;
import com.itheima.dao.AnimeInfoMapperUtils;
import com.itheima.pojo.AnimeInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-12 08:31:38
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/animeInfo")
@Controller
@RestController
public class AnimeInfoController {

    int i = 0;

    @RequestMapping("/test04")
    public String test04(@RequestBody List<AnimeInfo> animes) {

        i++;

        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();

        List<AnimeInfo> animeInfos = animeMapper.selectById(1);

        System.out.println("animes::" + animes);

        System.out.println(">>>" + i);

        animeInfos.forEach(System.out::println);


        return animeInfos.toString();

    }


//
//    @RequestMapping("/test03")
//    public String test03(String [] animes) {
//
//        i++;
//
//        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();
//
//        List<AnimeInfo> animeInfos = animeMapper.selectById(1);
//
//        System.out.println("animes::" + Arrays.toString(animes));
//
//        System.out.println(">>>" + i);
//
//        animeInfos.forEach(System.out::println);
//
//
//        return animeInfos.toString();
//
//    }
//
//



//
//    @RequestMapping("/test02")
//    public String test02(String name, Integer id) {
//
//        i++;
//
//        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();
//
//        List<AnimeInfo> animeInfos = animeMapper.selectById(1);
//
//        System.out.println("name::" + name);
//
//        System.out.println("id::" + id);
//
//        System.out.println(">>>" + i);
//
//        animeInfos.forEach(System.out::println);
//
//
//        return animeInfos.toString();
//
//    }

//
//    @RequestMapping("/test01")
//    public String test01(String name, Integer id) {
//
//        i++;
//
//        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();
//
//        List<AnimeInfo> animeInfos = animeMapper.selectById(1);
//
//        System.out.println("name::" + name);
//
//        System.out.println("id::" + id);
//
//        System.out.println(">>>" + i);
//
//        animeInfos.forEach(System.out::println);
//
//
//        return animeInfos.toString();
//
//    }


}
