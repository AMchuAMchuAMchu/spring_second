package com.itheima.pojo;

import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 20:13:32
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public class SayHelloImpl implements SayHello{
    @Override
    public void printHello() {
        System.out.println("Hello,Darling in the  FRANxx...");
    }
}
