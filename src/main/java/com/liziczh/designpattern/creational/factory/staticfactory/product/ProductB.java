package com.liziczh.designpattern.creational.factory.staticfactory.product;

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

    public ProductB(String name) {
        this.name = name;
        System.out.println("ProductB create, name=" + name);
    }

    @Override
    public void doSomething() {
        System.out.println("ProductB doSomething, name=" + name);
    }

}
