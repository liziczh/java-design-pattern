package com.liziczh.designpattern.structural.proxy.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * cglib动态代理
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 5:33 PM
 */
public class CglibProxyHandler implements MethodInterceptor {

    public Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new CglibProxyHandler());
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("Proxy doBefore...");

        Object result = methodProxy.invokeSuper(o, args);

        System.out.println("Proxy doAfter...");

        return result;
    }

}
