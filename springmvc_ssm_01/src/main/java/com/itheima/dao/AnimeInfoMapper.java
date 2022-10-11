package com.itheima.dao;

import com.itheima.pojo.AnimeInfo;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-12 04:53:23
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface AnimeInfoMapper {

    List<AnimeInfo> selectAll();

    List<AnimeInfo> selectById(Integer id);

    void insertOne(AnimeInfo animeInfo);

    void deleteById(Integer id);

    void updateById(AnimeInfo animeInfo);

}
