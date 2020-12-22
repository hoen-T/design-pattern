package com.design.builder.computer;

/**
 * @author hoen-T
 */
public class ComputerDirector {
    public void  makeComputer(ComputerBuilder builder){
        builder.setDisplay();
        builder.setKeyboard();
        builder.setCount();
    }
}
