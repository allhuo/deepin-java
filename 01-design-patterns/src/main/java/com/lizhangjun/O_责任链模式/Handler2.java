package com.lizhangjun.O_责任链模式;

public class Handler2 extends Handler{

    @Override
    void handlerRequest(int request) {
        if (request == 2){
            System.out.println("请求被handler2处理");
        }else {
            successor.handlerRequest(request);
        }
    }
}
