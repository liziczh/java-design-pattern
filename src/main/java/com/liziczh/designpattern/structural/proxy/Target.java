package com.liziczh.designpattern.structural.proxy;

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
    public void doSomething(String name) {
        System.out.println(name + " do something... ");
    }

}
