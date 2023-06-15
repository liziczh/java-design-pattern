package com.liziczh.designpattern.structural.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.liziczh.designpattern.structural.proxy.ITarget;
import com.liziczh.designpattern.structural.proxy.Target;

/**
 * jdk动态代理，只能通过接口代理
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2023/6/13 3:40 PM
 */
public class JdkProxyHandler implements InvocationHandler {

    private Object target;

    public Object getProxy(Object obj) {
        this.target = obj;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before...");
        Object result = method.invoke(target, args);
        System.out.println("after...");
        return result;
    }

    public static void main(String[] args) {
        // 未代理
        ITarget target = new Target();
        target.doSomething("Tom");

        // JDK代理对象
        JdkProxyHandler jdkProxyHandler = new JdkProxyHandler();
        ITarget jdkTargetProxy = (ITarget) jdkProxyHandler.getProxy(new Target());
        jdkTargetProxy.doSomething("Bob");

        // JDK直接代理
        jdkTargetProxy = (ITarget) Proxy.newProxyInstance(target.getClass().getClassLoader(),
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
        jdkTargetProxy.doSomething("John");
    }
}
