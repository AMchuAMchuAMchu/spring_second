package com.itheima.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 21:24:28
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@Component
public class AnimeInfo {

    private String name;

    private Integer releaseTime;

    private String character01;

    private String character02;

    private Integer id;

}
