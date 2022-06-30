package com.liziczh.designpattern.creational.factory.staticfactory;

import com.liziczh.designpattern.creational.factory.staticfactory.factory.ProductStaticFactory;

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
        System.out.println(ProductStaticFactory.create("a"));
        System.out.println(ProductStaticFactory.create("a"));
        System.out.println(ProductStaticFactory.create("b"));
        System.out.println(ProductStaticFactory.create("b"));
        System.out.println(ProductStaticFactory.create("c"));
        System.out.println(ProductStaticFactory.create("c"));
    }

}
