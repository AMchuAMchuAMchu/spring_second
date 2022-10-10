package com.itheima.test;

import com.itheima.controller.AnimeController;
import com.itheima.springmvcconfig.MVCInit;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-10 15:13:01
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeTest01 {


    @Test
    public void testBeanExclude(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

        AnimeController bean = ac.getBean(AnimeController.class);

        bean.getAnimeInfo();


    }

}
