package com.liziczh.designpattern.creational.factory.factorymethod;

import com.liziczh.designpattern.creational.factory.factorymethod.factory.FactoryA;
import com.liziczh.designpattern.creational.factory.factorymethod.factory.FactoryB;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 8:17 PM
 */
public class Client {

    public static void main(String[] args) {
        new FactoryA().create().doSomething();
        new FactoryB().create().doSomething();
    }

}
