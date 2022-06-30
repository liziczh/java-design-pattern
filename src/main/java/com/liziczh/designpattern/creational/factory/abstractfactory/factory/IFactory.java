package com.liziczh.designpattern.creational.factory.abstractfactory.factory;

import com.liziczh.designpattern.creational.factory.abstractfactory.product.IProductA;
import com.liziczh.designpattern.creational.factory.abstractfactory.product.IProductB;

/**
 * 抽象工厂
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 8:14 PM
 */
public interface IFactory {
    IProductA createA();

    IProductB createB();
}
