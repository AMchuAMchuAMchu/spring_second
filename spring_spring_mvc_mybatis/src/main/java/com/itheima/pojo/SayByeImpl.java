package com.itheima.pojo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 20:33:51
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public class SayByeImpl implements SayBye{


    @Override
    public void sayByeBye() {
        System.out.println("say bye bye ...:-)");
    }
}
