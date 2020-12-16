package com.lizhangjun.O_责任链模式;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handlerRequest(int request);
}
