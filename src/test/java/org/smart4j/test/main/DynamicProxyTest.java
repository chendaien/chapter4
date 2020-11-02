package org.smart4j.test.main;

import org.smart4j.test.dynamic.DynamicProxy;
import org.smart4j.test.service.Hello;
import org.smart4j.test.service.impl.HelloImpl;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    public static void main(String[] args){
        Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);

        Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(),hello.getClass().getInterfaces(),dynamicProxy);

        helloProxy.say("Jack Are you OK? ");

    }

}
