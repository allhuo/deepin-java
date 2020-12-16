package com.lizhangjun.A_简单工厂模式;

public class ComputerFactory {
    public Computer getComputer(String brand){
        if (brand.equals("mac")){
            return new MacComputer();
        }else if (brand.equals("dell")){
            return new DellComputer();
        }else {
            return null;
        }
    }
}
