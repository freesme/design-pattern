package com.freesme.proxy_pattern.javaproxy;

import java.lang.reflect.Proxy;

public class Domain {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);

        Subject subject = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        subject.sellBooks();
        subject.speak();
    }
}
