package com.itheima.dao;

import com.itheima.domain.AnimeInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

//    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into anime_info values(#{id},#{name},#{character01},#{character02},#{releaseTime})")
    public void save(AnimeInfo book);

    @Update("update anime_info set id = #{id}, name = #{name}, character01 = #{character01}, character02 = #{character02}, release_time = #{releaseTime} where id = #{id}")
    public void update(AnimeInfo book);

    @Delete("delete from anime_info where id = #{id}")
    public void delete(Integer id);

    @Select("select * from anime_info where id = #{id}")
    public AnimeInfo getById(Integer id);

    @Select("select * from anime_info")
    public List<AnimeInfo> getAll();
}
