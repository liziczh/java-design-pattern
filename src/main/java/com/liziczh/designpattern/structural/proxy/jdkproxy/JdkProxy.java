package com.liziczh.designpattern.structural.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 4:59 PM
 */
public class JdkProxy implements InvocationHandler {

    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        doBefore();

        Object result = method.invoke(target, args);

        doAfter();

        return result;
    }

    public void doBefore() {
        System.out.println("Proxy doBefore...");
    }

    public void doAfter() {
        System.out.println("Proxy doAfter...");
    }

}
