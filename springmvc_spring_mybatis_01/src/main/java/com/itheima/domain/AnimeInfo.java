package com.itheima.domain;

import lombok.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.domain
 * Version ==> 1.0
 * CreateTime ==> 2022-10-13 14:30:22
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeInfo {

    private String name;

    private Integer releaseTime;

    private String character01;

    private String character02;

    private Integer id;

    @Override
    public String toString() {
        return "AnimeInfo{" +
                "name='" + name + '\'' +
                ", releaseTime=" + releaseTime +
                ", character01='" + character01 + '\'' +
                ", character02='" + character02 + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Integer releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getCharacter01() {
        return character01;
    }

    public void setCharacter01(String character01) {
        this.character01 = character01;
    }

    public String getCharacter02() {
        return character02;
    }

    public void setCharacter02(String character02) {
        this.character02 = character02;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
