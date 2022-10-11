package com.itheima.dao;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-12 06:01:47
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class DruidDataSourceConfig implements DataSourceFactory {

    private Properties prop;

    public DruidDataSourceConfig() {

        System.out.println("i am DruidDataSourceConfig ... initing ...");

    }

    @Override
    public void setProperties(Properties props) {
        this.prop = props;
    }

    @Override
    public DataSource getDataSource() {

        DruidDataSource druidDataSource = new DruidDataSource();

        druidDataSource.setDriverClassName(prop.getProperty("jdbc.driverClassName"));
        druidDataSource.setUrl(prop.getProperty("jdbc.url"));
        druidDataSource.setUsername(prop.getProperty("jdbc.username"));
        druidDataSource.setPassword(prop.getProperty("jdbc.password"));
        return druidDataSource;
    }
}
