package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/save")
    @ResponseBody
    public String saveAnimeInfo(){
        System.out.println((i++)+">> save Lycoris Recoil");
        return "{'name':'save Lycoris Recoil'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteAnimeInfo(){
        System.out.println((i++)+">> delete Lycoris Recoil");
        return "{'name':'delete Lycoris Recoil'}";
    }
}
