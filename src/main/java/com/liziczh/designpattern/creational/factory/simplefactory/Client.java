package com.liziczh.designpattern.creational.factory.simplefactory;

import com.liziczh.designpattern.creational.factory.simplefactory.factory.ProductFactory;

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
        System.out.println(ProductFactory.create("a"));
        System.out.println(ProductFactory.create("a"));
        System.out.println(ProductFactory.create("b"));
        System.out.println(ProductFactory.create("b"));
        System.out.println(ProductFactory.create("c"));
        System.out.println(ProductFactory.create("c"));
    }

}
