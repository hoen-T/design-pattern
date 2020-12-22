package com.design.builder.main;

import com.design.builder.build.MsgInfo;
import com.design.builder.computer.*;

/**
 * @author hoen-T
 */
public class DoBuildeComputer {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();//1
        ComputerBuilder builder = new AppleComputerBuilder("M1处理器", "三星125");//2
        director.makeComputer(builder);//3
        Computer appleComputer = builder.getComputer();//4
        System.out.println("apple computer:" + appleComputer.toString());

        ComputerBuilder asusBuilder = new AsusComputerBuilder("I7处理器", "三星ddr4 16G");
        director.makeComputer(asusBuilder);
        Computer asusComputer = asusBuilder.getComputer();
        System.out.println("asus computer:" + asusComputer.toString());


        MsgInfo build = MsgInfo.of().setCode(1111).build();
        MsgInfo build1 = MsgInfo.of().setE(1111).build();

        Integer code = build.getCode();
        System.out.println(code);
        Object t = build1.getT();

        System.out.println(code);
        System.out.println(t);

    }
}
