package com.itheima.service;

import com.itheima.dao.AnimeInfoDao;
import com.itheima.domain.AnimeInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 14:51:24
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Transactional
public interface AnimeInfoService {

    boolean insertOne(AnimeInfo animeInfo);

    boolean deleteById(Integer id);

    boolean updateById(AnimeInfo animeInfo);

    AnimeInfo selectById(Integer id);

    List<AnimeInfo> selectAll();

}
