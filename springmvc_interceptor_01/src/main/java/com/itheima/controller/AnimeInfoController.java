package com.itheima.controller;

import com.itheima.dao.AnimeInfoDao;
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
 * CreateTime ==> 2022-10-13 20:52:44
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RestController
@RequestMapping("/animeInfo")
public class AnimeInfoController {

    @Autowired
    private AnimeInfoService animeInfoService;

    @PostMapping
    public Result insert(@RequestBody AnimeInfo animeInfo){
        boolean b = animeInfoService.insertOne(animeInfo);
        return new Result(b?Code.POST_SUCCESS:Code.POST_ERR,b?"SUCCESS":"FAILED");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        boolean b = animeInfoService.deleteOne(id);
        return new Result(b?Code.DELETE_SUCCESS:Code.DELETE_ERR,b?"SUCCESS":"FAILED");
    }

    @PutMapping
    public Result update(@RequestBody AnimeInfo animeInfo){
        boolean b = animeInfoService.updateById(animeInfo);
        return new Result(b?Code.PUT_SUCCESS:Code.PUT_ERR,b?"SUCCESS":"FAILED");
    }

    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
//        if (id == 1){
//            throw new BusinessException("不要用你的流氓手段挑战我的技术底线...^_^",new NumberFormatException(),Code.GET_EXCEPTION);
//        }
//        try {
//            int i = 10/0;
//        } catch (Exception e) {
//            throw  new SystemException("果咩纳塞~~",new StackOverflowError(),Code.GET_EXCEPTION);
//        }
        AnimeInfo animeInfo = animeInfoService.selectById(id);
        return new Result(animeInfo!=null?Code.GET_SUCCESS:Code.GET_ERR,animeInfo!=null?"SUCCESS":"FAILED",animeInfo);
    }

    @GetMapping
    public Result selectAll(){
        List<AnimeInfo> animeInfos = animeInfoService.selectAll();
        return new Result(animeInfos!=null?Code.GET_SUCCESS:Code.GET_ERR,animeInfos!=null?"SUCCESS":"FAILED",animeInfos);
    }

}
