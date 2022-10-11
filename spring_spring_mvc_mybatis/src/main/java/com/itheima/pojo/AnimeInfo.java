package com.itheima.pojo;

import com.itheima.dao.AnimeInfoMapperUtils;
import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.dao.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 15:33:31
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@Component
public class AnimeInfo {



    private String name;

    private Integer release_time;

    private String character01;

    private String character02;

    private Integer id;


}
