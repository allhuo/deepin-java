package com.lizhangjun.part03;

public abstract class AbstractComputerFactory {

    public abstract <T extends Computer> T createComputer(Class<T> c);
}
