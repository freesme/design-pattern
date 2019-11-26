package com.freesme.proxy_pattern.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//处理器对象  实现InvocationHandler
public class MyInvocationHandler implements InvocationHandler {
    Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if (method.getName().equals("sellBooks")){
            int invoke = (int) method.invoke(realSubject, args);
            System.out.println("代理类增强卖书buffer：成交价+10");
            return invoke;
        }else if (method.getName().equals("speak")){
            String invoke = (String) method.invoke(realSubject, args);
            System.out.println("代理类增强说话buffer：有问必答");
            return invoke;
        }
        return null;
    }
}
