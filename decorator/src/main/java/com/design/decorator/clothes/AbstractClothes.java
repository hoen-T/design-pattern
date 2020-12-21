package com.design.decorator.clothes;

import com.design.decorator.po.User;

/**
 * 衣服抽象类
 *
 * @author hoen-T
 */
public abstract class AbstractClothes implements Clothes {

    public void wear(User user) {
        user.wearClothes(this);
    }

    public AbstractClothes() {

    }

}
