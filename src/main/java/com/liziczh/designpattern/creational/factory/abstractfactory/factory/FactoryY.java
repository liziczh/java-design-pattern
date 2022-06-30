package com.liziczh.designpattern.creational.factory.abstractfactory.factory;

import com.liziczh.designpattern.creational.factory.abstractfactory.product.IProductA;
import com.liziczh.designpattern.creational.factory.abstractfactory.product.IProductB;
import com.liziczh.designpattern.creational.factory.abstractfactory.product.ProductYA;
import com.liziczh.designpattern.creational.factory.abstractfactory.product.ProductYB;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 8:15 PM
 */
public class FactoryY implements IFactory {

    @Override
    public IProductA createA() {
        return new ProductYA();
    }

    @Override
    public IProductB createB() {
        return new ProductYB();
    }
}
