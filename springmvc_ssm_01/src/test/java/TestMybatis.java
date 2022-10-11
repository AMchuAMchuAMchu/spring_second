import com.itheima.dao.AnimeInfoMapper;
import com.itheima.dao.AnimeInfoMapperUtils;
import com.itheima.pojo.AnimeInfo;
import org.junit.Test;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-12 05:17:11
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class TestMybatis {




    @Test
    public void testSelect(){
        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();

        List<AnimeInfo> animeInfos = animeMapper.selectAll();

        animeInfos.forEach(System.out::println);


    }

}
