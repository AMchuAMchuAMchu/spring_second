package com.itheima.controller;

import org.apache.ibatis.annotations.DeleteProvider;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-12 15:33:27
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/rest")
@RestController
public class RestTestController {


    @GetMapping("/date")
    public String date(Date date){

        System.out.println("date"+date);

        return "date....";

    }


    @GetMapping("/{name}")
    public String get(@PathVariable String name){

        System.out.println("name::"+name);
        return "get ... ";

    }


    @PostMapping("/{name}")
    public String post(String name){
        System.out.println("name::"+name);
        return "post...";
    }

    @PutMapping("/{name}")
    public String put(String name){
        System.out.println("name::"+name);
        return "put...";
    }

    @DeleteMapping("/{name}")
    public String delete(String name){
        System.out.println("name::"+name);
        return "delete...";
    }


}
