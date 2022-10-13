package com.itheima.service;

import com.itheima.domain.AnimeInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(AnimeInfo book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(AnimeInfo book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public AnimeInfo getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<AnimeInfo> getAll();
}
