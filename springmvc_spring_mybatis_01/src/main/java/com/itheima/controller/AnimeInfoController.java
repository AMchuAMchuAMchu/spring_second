package com.itheima.controller;

import com.itheima.domain.AnimeInfo;
import com.itheima.service.AnimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 14:59:02
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/animeInfo")
@RestController
public class AnimeInfoController {


    @Autowired
    private AnimeInfoService animeInfoService;

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){

        AnimeInfo animeInfo = animeInfoService.selectById(id);

        Integer code = animeInfo!=null?Code.CODE_GET_SUCCESS:Code.CODE_GET_ERR;

        String msg = animeInfo!=null?"success":"filed";

        return new Result(code,msg,animeInfo);

    }

    @GetMapping
    public Result getAll(){

        List<AnimeInfo> animeInfos = animeInfoService.selectAll();

        Integer code = animeInfos!=null?Code.CODE_GET_SUCCESS:Code.CODE_GET_ERR;

        String msg = animeInfos!=null?"success":"filed";

        return new Result(code,msg,animeInfos);

    }

    @PutMapping
    public Result updateById(AnimeInfo animeInfo){

        boolean b = animeInfoService.updateById(animeInfo);

        return new Result(b?Code.CODE_PUT_SUCCESS:Code.CODE_PUT_ERR,b?"success":"failed");


    }


    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean b = animeInfoService.deleteById(id);

        return new Result(b?Code.CODE_DELETE_SUCCESS:Code.CODE_DELETE_ERR,b?"success":"failed");


    }


    @PostMapping
    public Result post(AnimeInfo animeInfo){

        boolean b = animeInfoService.insertOne(animeInfo);

        return new Result(b?Code.CODE_POST_SUCCESS:Code.CODE_POST_ERR,b?"success":"failed");

    }




}
