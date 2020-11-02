package org.smart4j.test.main;

import org.smart4j.test.dynamic.CGLibProxy;
import org.smart4j.test.service.Hello;
import org.smart4j.test.service.impl.HelloImpl;

public class CGLibProxyTest {

    public static void main(String[] args){
        CGLibProxy cgLibProxy = new CGLibProxy();
        Hello helloProxy = cgLibProxy.getProxy(HelloImpl.class);
        helloProxy.say("Year");
    }

}
