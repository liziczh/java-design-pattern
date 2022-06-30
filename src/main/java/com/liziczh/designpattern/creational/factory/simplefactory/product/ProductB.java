package com.liziczh.designpattern.creational.factory.simplefactory.product;

/**
 * 产品B
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 11:20 上午
 */
public class ProductB implements IProduct {

    private String name;

    @Override
    public void doSomething() {
        System.out.println("ProductB doB");
    }
}
