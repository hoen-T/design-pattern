package com.design.decorator.clothes;

import com.design.decorator.po.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * T衬衫
 *
 * @author hoen-T
 **/
public class Tshirt extends AbstractClothes {


    @Override
    public void show() {
        super.show();
        System.out.print(" T衬衫 ");
    }
}
