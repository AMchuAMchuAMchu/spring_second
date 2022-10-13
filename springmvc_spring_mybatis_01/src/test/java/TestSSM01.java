import com.itheima.config.SpringConfig;
import com.itheima.dao.AnimeInfoDao;
import com.itheima.domain.AnimeInfo;
import com.itheima.service.AnimeInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 16:36:11
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestSSM01 {


    @Autowired
    private AnimeInfoService animeInfoService;


    @Test
    public void testSelectAll(){


        List<AnimeInfo> animeInfos = animeInfoService.selectAll();
        animeInfos.forEach(System.out::println);



    }

}
