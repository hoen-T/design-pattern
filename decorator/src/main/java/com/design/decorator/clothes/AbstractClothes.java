package com.design.decorator.clothes;

import com.design.decorator.po.User;

/**
 * 衣服抽象类
 *
 * @author hoen-T
 */
public abstract class AbstractClothes extends User {

    protected User user;

    public void wear(User user) {
        this.user = user;
    }

    public AbstractClothes() {
    }

    @Override
    public void show() {
        user.show();
    }
}
