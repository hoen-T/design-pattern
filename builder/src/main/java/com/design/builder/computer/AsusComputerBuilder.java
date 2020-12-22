package com.design.builder.computer;

/**
 * @author hoen-T
 */
public class AsusComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public AsusComputerBuilder(String cpu, String ram) {
        this.computer = new Computer(cpu, ram);
    }


    @Override
    public void setCount() {
        computer.setCount(4580);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("华硕键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("华硕显示器");

    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
