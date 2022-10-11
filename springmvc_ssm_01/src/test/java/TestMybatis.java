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
    public void testDelete(){

        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();

        animeMapper.deleteById();

    }


    @Test
    public void testUpdate(){

        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();

        AnimeInfo animeInfo = new AnimeInfo();
        animeInfo.setName("SAO刀剑神域Alicization war of underworld");
        animeInfo.setReleaseTime(2018);
        animeInfo.setCharacter01("Alice茅野爱衣");
        animeInfo.setCharacter02("尤吉欧岛崎信长");
        animeInfo.setId(26);


        animeMapper.updateById(animeInfo);

    }


    @Test
    public void testInsert(){

        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();
        AnimeInfo animeInfo = new AnimeInfo();
        animeInfo.setName("SAO刀剑神域Alicization war of underworld");
        animeInfo.setReleaseTime(2018);
        animeInfo.setCharacter01("Alice");
        animeInfo.setCharacter02("尤吉欧");
        animeInfo.setId(25);
        animeMapper.insertOne(animeInfo);

    }


    @Test
    public void testSelect(){
        AnimeInfoMapper animeMapper = AnimeInfoMapperUtils.getAnimeMapper();

        List<AnimeInfo> animeInfos = animeMapper.selectAll();

        animeInfos.forEach(System.out::println);


    }

}
