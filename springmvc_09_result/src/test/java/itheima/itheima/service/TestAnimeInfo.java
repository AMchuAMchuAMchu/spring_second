package itheima.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.AnimeInfo;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springmvc_09_result
 * BelongsPackage ==> itheima.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 18:55:53
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestAnimeInfo {


    @Autowired
    private BookService bookService;

    @Test
    public void testSelectAll(){

        List<AnimeInfo> all = bookService.getAll();
        all.forEach(System.out::println);


    }



}
