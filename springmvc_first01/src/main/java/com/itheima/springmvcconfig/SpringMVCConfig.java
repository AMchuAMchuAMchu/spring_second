package com.itheima.springmvcconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.springmvcconfig
 * Version ==> 1.0
 * CreateTime ==> 2022-10-10 11:28:45
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */

//@ComponentScan(value = "com.itheima",
//    excludeFilters = @ComponentScan.Filter(
//            type = FilterType.ANNOTATION,
//            classes = Controller.class
//    )
//)
@Configuration
@ComponentScan("com.itheima")
@EnableWebMvc
public class SpringMVCConfig {
}
