package com.liziczh.designpattern.structural.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 5:14 PM
 */
public class Target implements ITarget {

    @Override
    public void doSomething() {
        System.out.println("Target do something...");
    }

    public static void main(String[] args) {
        // 未代理
        ITarget target = new Target();
        target.doSomething();

        // 代理对象
        JdkProxyHandler proxyHandler = new JdkProxyHandler();
        ITarget targetProxy = (ITarget) proxyHandler.getProxy(new Target());
        targetProxy.doSomething();

        // 直接代理
        targetProxy = (ITarget) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before target...");
                        Object result = method.invoke(target, args);
                        System.out.println("after target...");
                        return result;
                    }
                });
        targetProxy.doSomething();
    }

}
