package org.smart4j.test.main;

import org.smart4j.test.service.Hello;
import org.smart4j.test.service.impl.HelloProxy;

public class HelloProxyTest {

    public static void main(String[] args){
        Hello hello = new HelloProxy();
        hello.say("Jack");
    }

}
