package com.itheima.dao;

import com.itheima.domain.AnimeInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 20:38:52
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface AnimeInfoDao {
    @Insert("insert into anime_info values (#{name},#{release_time},#{character01},#{character02},#{id})")
    Integer insertOne(AnimeInfo animeInfo);

    @Delete("delete from anime_info where id = #{id}")
    Integer deleteById(Integer id);

    @Update("update anime_info set name = #{name}, release_time = #{release_time}, character01 = #{character01}, character02 = #{character02}, id = #{id} where id = #{id}")
    Integer updateById(AnimeInfo animeInfo);

    @Select("select * from anime_info where id = #{id}")
    AnimeInfo selectById(Integer id);

    @Select("select * from anime_info")
    List<AnimeInfo> selectAll();
}
