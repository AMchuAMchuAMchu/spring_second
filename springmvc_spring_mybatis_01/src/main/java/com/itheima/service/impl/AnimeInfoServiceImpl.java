package com.itheima.service.impl;

import com.itheima.dao.AnimeInfoDao;
import com.itheima.domain.AnimeInfo;
import com.itheima.service.AnimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 14:54:18
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeInfoServiceImpl implements AnimeInfoService {


    @Autowired
    private AnimeInfoDao animeInfoDao;


    @Override
    public boolean insertOne(AnimeInfo animeInfo) {
        animeInfoDao.insertOne(animeInfo);
        return true;
    }

    @Override
    public boolean deleteById(Integer id) {
        animeInfoDao.deleteById(id);
        return true;
    }

    @Override
    public boolean updateById(AnimeInfo animeInfo) {
        animeInfoDao.updateById(animeInfo);
        return true;
    }

    @Override
    public AnimeInfo selectById(Integer id) {
        AnimeInfo animeInfo = animeInfoDao.selectById(id);
        return animeInfo;
    }

    @Override
    public List<AnimeInfo> selectAll() {
        List<AnimeInfo> animeInfos = animeInfoDao.selectAll();
        return animeInfos;
    }
}
