package com.itheima.dao;

import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 15:30:42
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Mapper
@Repository
public interface AnimeInfoMapper {

    void insertAnime(AnimeInfo animeInfo);

    void deleteAnime(Integer id);

    void updateAnime(AnimeInfo animeInfo);

    List<AnimeInfo> selectAnime(Integer id);

    List<AnimeInfo> selectAnimeById(Integer id);


}
