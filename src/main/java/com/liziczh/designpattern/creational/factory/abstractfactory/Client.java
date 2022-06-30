package com.liziczh.designpattern.creational.factory.abstractfactory;

import com.liziczh.designpattern.creational.factory.abstractfactory.factory.FactoryX;
import com.liziczh.designpattern.creational.factory.abstractfactory.factory.FactoryY;

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
        new FactoryX().createA().doA();
        new FactoryX().createB().doB();
        new FactoryY().createA().doA();
        new FactoryY().createB().doB();
    }

}
