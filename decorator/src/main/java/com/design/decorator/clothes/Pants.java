package com.design.decorator.clothes;

import com.design.decorator.po.User;

/**
 * 裤子
 *
 * @author hoen-T
 **/
public class Pants extends AbstractClothes {

    @Override
    public void show() {
        super.show();
        System.out.print(" 裤子 ");
    }
}
