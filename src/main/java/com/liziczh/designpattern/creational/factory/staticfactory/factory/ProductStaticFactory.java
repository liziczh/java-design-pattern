package com.liziczh.designpattern.creational.factory.staticfactory.factory;

import java.util.HashMap;
import java.util.Map;

import com.liziczh.designpattern.creational.factory.staticfactory.product.IProduct;
import com.liziczh.designpattern.creational.factory.staticfactory.product.ProductA;
import com.liziczh.designpattern.creational.factory.staticfactory.product.ProductB;

/**
 * 静态工厂
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 2:51 PM
 */
public class ProductStaticFactory {

    public static final Map<String, IProduct> MAP = new HashMap<String, IProduct>();

    static {
        MAP.put("a", new ProductA("a"));
        MAP.put("b", new ProductB("b"));
    }

    public static IProduct create(String name) {
        return MAP.get(name);
    }

}
