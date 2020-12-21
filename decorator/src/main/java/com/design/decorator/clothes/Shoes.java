package com.design.decorator.clothes;

import com.design.decorator.po.User;

/**
 * 鞋子
 *
 * @author hoen-T
 */
public class Shoes extends AbstractClothes {

    @Override
    public void show() {
        super.show();
        System.out.print(" 鞋子 ");
    }
}
