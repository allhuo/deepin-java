package com.lizhangjun.I_组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }


    @Override
    void add(Component c) {
        children.add(c);
    }

    @Override
    void remove(Component c) {
        children.remove(c);
    }

    @Override
    void display(int depth) {
        for (int i = 0 ; i < depth ; i++){
            System.out.print("-");
        }
        System.out.println(name);

        for (Component c : children){
            c.display(depth + 2);
        }
    }
}
