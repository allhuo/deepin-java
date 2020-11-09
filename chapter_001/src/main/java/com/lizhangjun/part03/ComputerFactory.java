package com.lizhangjun.part03;

public class ComputerFactory extends AbstractComputerFactory{

    @Override
    public <T extends Computer> T createComputer(Class<T> c) {
        Computer computer = null;
        try {
            computer = (T)Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            System.out.println("电脑生产错误！");
        }
        return (T) computer;
    }
}
