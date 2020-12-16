package com.lizhangjun.O_责任链模式;

public class Handler3 extends Handler{

    @Override
    void handlerRequest(int request) {
        if (request == 3){
            System.out.println("请求被handler3处理");
        }else {
            successor.handlerRequest(request);
        }
    }
}
