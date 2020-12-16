package com.lizhangjun.G_代理模式;

public class ProxyLeader implements Computer{

    private final Worker worker;

    public ProxyLeader() {
        this.worker = new Worker();
    }

    @Override
    public void give() {
        worker.give();
    }
}
