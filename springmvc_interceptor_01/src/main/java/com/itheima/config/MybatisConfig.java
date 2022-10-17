package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 20:25:32
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean getSSFB(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        ssfb.setDataSource(dataSource);

        ssfb.setTypeAliasesPackage("com.itheima.domain");

        return ssfb;
    }


    @Bean
    public MapperScannerConfigurer getMSC(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();

        msc.setBasePackage("com.itheima.dao");

        return msc;
    }

}
