package com.itheima.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.mapper
 * Version ==> 1.0
 * CreateTime ==> 2022-10-09 18:09:07
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Mapper
public interface AccountMapper {

    @Insert("update account set money = money + #{money} where id = 1")
    void insertAdd(@Param("money") int money);

    @Insert("update account set money = money - #{money} where id = 2")
    void insertSub(@Param("money") int money);

}
