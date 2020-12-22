package com.design.builder.computer;

/**
 * @author hoen-T
 */
public class AppleComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public AppleComputerBuilder(String cpu, String ram) {
        this.computer = new Computer(cpu, ram);
    }

    @Override
    public void setCount() {
        computer.setCount(6899);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");

    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
