package com.itheima.test;

import com.itheima.pojo.SayHello;
import com.itheima.controller.SpringConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 20:28:52
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public class demo {


    @Autowired
    private SayHello sayHello;



    @Test
    public void testAnime(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        SayHello bean = ac.getBean(SayHello.class);

        bean.printHello();
    }



}
