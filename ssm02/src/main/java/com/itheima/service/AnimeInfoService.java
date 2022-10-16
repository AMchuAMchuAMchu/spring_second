package com.itheima.service;

import com.itheima.domain.AnimeInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 20:45:42
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Transactional
public interface AnimeInfoService {
    /**
    * Description ==> TODO
    * Return Type ==> boolean
    * Params args ==> [com.itheima.domain.AnimeInfo]
    * Create Time ==> 2022/10/13 20:50
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    boolean insertOne(AnimeInfo animeInfo);

    boolean deleteOne(Integer id);

    boolean updateById(AnimeInfo animeInfo);

    AnimeInfo selectById(Integer id);

    List<AnimeInfo> selectAll();

}
