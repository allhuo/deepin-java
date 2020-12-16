package com.lizhangjun.O_责任链模式;

public class Handler1 extends Handler{

    @Override
    void handlerRequest(int request) {
        if (request == 1){
            System.out.println("请求被handler1处理");
        }else {
            successor.handlerRequest(request);
        }
    }
}
