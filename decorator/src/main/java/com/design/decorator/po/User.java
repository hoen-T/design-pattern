package com.design.decorator.po;

/**
 * 用户实体类
 *
 * @author hoen-T
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 展示身上穿的衣服
     */
    public void show() {
        System.out.print(name + "穿上了 ");
    }

    public User() {
    }
}
