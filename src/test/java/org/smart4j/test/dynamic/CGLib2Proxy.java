package org.smart4j.test.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLib2Proxy implements MethodInterceptor {

    private static CGLib2Proxy cgLib2Proxy = new CGLib2Proxy();

    private CGLib2Proxy(){}

    public <T>T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object result = proxy.invokeSuper(obj,args);
        after();
        return result;
    }

    private void before(){
        System.out.println(" before ");
    }

    private void after(){
        System.out.println(" after ");
    }

    public  static CGLib2Proxy getInstance(){
        return cgLib2Proxy;
    }
}
