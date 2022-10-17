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
 * CreateTime ==> 2022-10-13 20:49:18
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeInfoServiceImpl implements AnimeInfoService {

    @Autowired
    private AnimeInfoDao animeInfoDao;

    @Override
    public boolean insertOne(AnimeInfo animeInfo) {
        return animeInfoDao.insertOne(animeInfo)>0;
    }

    @Override
    public boolean deleteOne(Integer id) {
        return animeInfoDao.deleteById(id)>0;
    }

    @Override
    public boolean updateById(AnimeInfo animeInfo) {
        return animeInfoDao.updateById(animeInfo)>0;
    }

    @Override
    public AnimeInfo selectById(Integer id) {
        return animeInfoDao.selectById(id);
    }

    @Override
    public List<AnimeInfo> selectAll() {
        return animeInfoDao.selectAll();
    }
}
