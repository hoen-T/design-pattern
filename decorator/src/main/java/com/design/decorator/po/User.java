package com.design.decorator.po;

import com.design.decorator.clothes.Clothes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户实体类
 *
 * @author hoen-T
 **/
public class User {
    private String name;
    /**
     * 身上穿的衣服
     */
    private List<Clothes> clothes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wearClothes(Clothes clothes) {
        this.clothes.add(clothes);
    }

    /**
     * 展示身上穿的衣服
     */
    public void show() {
        List<String> collect = clothes.stream().map(Clothes::getClothesName).collect(Collectors.toList());
        System.out.println(getName() + "穿上了" + collect.toString());
    }

    public User() {
    }
}
