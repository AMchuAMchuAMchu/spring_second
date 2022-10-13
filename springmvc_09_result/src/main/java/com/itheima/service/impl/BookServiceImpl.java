package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.AnimeInfo;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(AnimeInfo book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(AnimeInfo book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public AnimeInfo getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<AnimeInfo> getAll() {
        return bookDao.getAll();
    }
}
