package com.liziczh.designpattern.creational.factory.factorymethod.factory;

import com.liziczh.designpattern.creational.factory.factorymethod.product.IProduct;
import com.liziczh.designpattern.creational.factory.factorymethod.product.ProductA;

/**
 * 工厂A
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 8:15 PM
 */
public class FactoryA implements IFactory {

    @Override
    public IProduct create() {
        return new ProductA();
    }
}
