package org.smart4j.test.service.impl;

import org.smart4j.test.service.Hello;

public class HelloProxy implements Hello {

    private Hello hello;

    public HelloProxy() {
        this.hello = new HelloImpl();
    }

    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void before(){
        System.out.println(" say before ");
    }

    private void after(){
        System.out.println(" say after ");
    }

}
