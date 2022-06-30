package com.liziczh.designpattern.creational.factory.simplefactory.factory;

import com.liziczh.designpattern.creational.factory.simplefactory.product.IProduct;
import com.liziczh.designpattern.creational.factory.simplefactory.product.ProductA;

/**
 * 简单工厂
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 2:51 PM
 */
public class ProductFactory {

    public static IProduct create(String name) {
        if ("a".equals(name)) {
            return new ProductA();
        } else if ("b".equals(name)) {
            return new ProductA();
        }
        return null;
    }

}
