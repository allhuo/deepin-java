package com.lizhangjun.I_组合模式;

public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    void add(Component c) {

    }

    @Override
    void remove(Component c) {

    }

    @Override
    void display(int depth) {
        for (int i = 0 ; i < depth ; i++){
            System.out.print("-");
        }
        System.out.println(name);
    }
}
