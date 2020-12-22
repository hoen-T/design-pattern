package com.design.builder.computer;

/**
 * @author hoen-T
 */
public class Computer {
    private String cpu;//必须
    private String ram;//必须
    private int count;//可选
    private String keyboard;//可选
    private String display;//可选

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + count +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}