package com.itheima.controller;

import com.itheima.pojo.AnimeInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-10 11:32:29
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Controller
@RequestMapping("/animeInfo")
public class AnimeController {

    int i = 0;


//    public String saveAnimeInfo(@RequestParam("name01") String name02,@RequestParam("releaseTime") Integer releaseTime02){
//    public String saveAnimeInfo(String name01,Integer releaseTime){
//        System.out.println("name01>>"+name01);
//        System.out.println("releaseTime>>"+releaseTime);
//        System.out.println((i++)+">> save Lycoris Recoil");
//        return "{'name':'save Lycoris Recoil'}";
//    }

    //    public String saveAnimeInfo(AnimeInfo animeInfo){
//        System.out.println(" >>> "+animeInfo);
//        System.out.println((i++)+">> save Lycoris Recoil");
//        return "{'name':'save Lycoris Recoil'}";
//    }

    //    public String saveAnimeInfo(String[] name) {
//        System.out.println(" >>> " + Arrays.toString(name));
//        System.out.println((i++) + ">> save Lycoris Recoil");
//        return "{'name':'save Lycoris Recoil'}";
//    }


//    public String saveAnimeInfo(@RequestParam List<String> name) {
//        System.out.println(">>>");
//        name.forEach(System.out::println);
//        System.out.println((i++) + ">> save Lycoris Recoil");
//        return "{'name':'save Lycoris Recoil'}";
//    }
    @RequestMapping("/save")
    @ResponseBody
    public String saveAnimeInfo(@RequestBody AnimeInfo animeInfo) {
        System.out.println(">>>"+animeInfo);
        System.out.println((i++) + ">> save Lycoris Recoil");
        return "{'name':'save Lycoris Recoil'}";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String deleteAnimeInfo() {
        System.out.println((i++) + ">> delete Lycoris Recoil");
        return "{'name':'delete Lycoris Recoil'}";
    }
}
