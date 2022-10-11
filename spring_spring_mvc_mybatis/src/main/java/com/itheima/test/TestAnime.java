package com.itheima.test;

import com.itheima.pojo.AnimeInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 18:18:06
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class TestAnime {

    @Autowired
    public AnimeInfo animeInfo;

    @Test
    public void testAnime(){

        animeInfo.setId(22);
        animeInfo.setName("Alice");
        animeInfo.setReleaseTime(2022);
        animeInfo.setCharacter01("雪乃");
        animeInfo.setCharacter02("由比滨结衣");
        System.out.println(animeInfo);

    }

}
