package com.liziczh.designpattern.structural.proxy.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.liziczh.designpattern.structural.proxy.Target;

/**
 * cglib动态代理：可以通过类代理
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
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Proxy doBefore...");
        Object result = methodProxy.invokeSuper(target, args);
        System.out.println("Proxy doAfter...");
        return result;
    }

    public static void main(String[] args) {
        // 未代理
        Target target = new Target();
        target.doSomething("Tom");

        // Cglib代理
        CglibProxyHandler cglibProxyHandler = new CglibProxyHandler();
        Target targetProxy = (Target) cglibProxyHandler.getProxy(Target.class);
        targetProxy.doSomething("Bob");

        // 直接Cglib代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy)
                    throws Throwable {
                System.out.println("target before...");
                Object result = methodProxy.invokeSuper(target, args);
                System.out.println("target after...");
                return result;
            }
        });
        targetProxy = (Target) enhancer.create();
        targetProxy.doSomething("John");
    }

}
