package com.lizhangjun.I_组合模式;

public class Main {

    public static void main(String[] args) {

        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite composite_x = new Composite("Composite X");
        composite_x.add(new Leaf("Leaf XA"));
        composite_x.add(new Leaf("Leaf XB"));

        root.add(composite_x);
        root.display(1);
    }
}
