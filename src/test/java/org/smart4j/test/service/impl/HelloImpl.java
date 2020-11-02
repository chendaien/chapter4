package org.smart4j.test.service.impl;

import org.smart4j.test.service.Hello;

public class HelloImpl implements Hello {

    @Override
    public void say(String name) {
        System.out.println(" Hello! "+name);
    }

}
