package com.liziczh.designpattern.creational.factory.factorymethod.factory;

import com.liziczh.designpattern.creational.factory.factorymethod.product.IProduct;

/**
 * 抽象工厂
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 8:14 PM
 */
public interface IFactory {
    IProduct create();
}
