package com.design.decorator.main;

import com.design.decorator.clothes.Pants;
import com.design.decorator.clothes.Shoes;
import com.design.decorator.clothes.Tshirt;
import com.design.decorator.po.User;

/**
 * 展示衣服客户端
 *
 * @author  hoen-T
 */
public class DoShow {
    public static void main(String[] args) {
        User user = new User();
        user.setName("hoen-T");
        Pants pants = new Pants();
        Shoes shoes = new Shoes();
        Tshirt tshirt = new Tshirt();
        pants.wear(user);
        shoes.wear(user);
        tshirt.wear(user);
        user.show();
    }
}
