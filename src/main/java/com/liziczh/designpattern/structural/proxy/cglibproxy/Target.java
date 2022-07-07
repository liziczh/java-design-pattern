package com.liziczh.designpattern.structural.proxy.cglibproxy;

/**
 * 目标类：被代理对象
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 5:14 PM
 */
public class Target {

    public void doSomething(String str) {
        System.out.println("Target do something... str=" + str);
    }

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Target target = (Target) proxy.getInstance(Target.class);
        target.doSomething("math");
    }
}
