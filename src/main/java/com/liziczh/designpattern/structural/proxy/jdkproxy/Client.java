package com.liziczh.designpattern.structural.proxy.jdkproxy;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 5:15 PM
 */
public class Client {

    public static void main(String[] args) {
        JdkProxy proxy = new JdkProxy(new Target());
        ITarget target = (ITarget) proxy.getInstance();
        target.doSomething("math");
    }

}
