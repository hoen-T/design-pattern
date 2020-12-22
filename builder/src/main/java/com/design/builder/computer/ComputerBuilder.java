package com.design.builder.computer;


/**
 * @author hoen-T
 */
public abstract  class ComputerBuilder {
    public abstract void setCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}
