package com.liziczh.designpattern.creational.factory.abstractfactory.factory;

import com.liziczh.designpattern.creational.factory.abstractfactory.product.IProductA;
import com.liziczh.designpattern.creational.factory.abstractfactory.product.IProductB;
import com.liziczh.designpattern.creational.factory.abstractfactory.product.ProductXA;
import com.liziczh.designpattern.creational.factory.abstractfactory.product.ProductXB;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 8:15 PM
 */
public class FactoryX implements IFactory {

    @Override
    public IProductA createA() {
        return new ProductXA();
    }

    @Override
    public IProductB createB() {
        return new ProductXB();
    }

}
