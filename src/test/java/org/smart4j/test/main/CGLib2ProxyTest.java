package org.smart4j.test.main;

import org.smart4j.test.dynamic.CGLib2Proxy;
import org.smart4j.test.service.Hello;
import org.smart4j.test.service.impl.HelloImpl;

public class CGLib2ProxyTest {

    public static void main(String[] args){
        Hello helloProxy = CGLib2Proxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.say("cgLib2Proxy");
    }

}
