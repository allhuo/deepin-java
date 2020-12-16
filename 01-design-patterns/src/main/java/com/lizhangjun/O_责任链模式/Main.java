package com.lizhangjun.O_责任链模式;

public class Main {

    public static void main(String[] args) {
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] requests = {2,3,1,3,2,3,3};

        for (int request : requests){
            handler1.handlerRequest(request);
        }
    }
}
