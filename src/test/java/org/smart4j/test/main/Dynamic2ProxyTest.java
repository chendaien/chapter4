package org.smart4j.test.main;

import org.smart4j.test.dynamic.Dynamic2Proxy;
import org.smart4j.test.service.Hello;
import org.smart4j.test.service.impl.HelloImpl;

public class Dynamic2ProxyTest {

    public static void main(String[] args){
        Dynamic2Proxy dynamic2Proxy =new Dynamic2Proxy(new HelloImpl());
        Hello helloProxy = dynamic2Proxy.getProxy();
        helloProxy.say("mariy");
    }

}
