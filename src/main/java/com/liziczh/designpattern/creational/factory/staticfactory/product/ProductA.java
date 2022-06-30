package com.liziczh.designpattern.creational.factory.staticfactory.product;

/**
 * 产品A
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 11:20 上午
 */
public class ProductA implements IProduct {

    private String name;

    public ProductA(String name) {
        this.name = name;
        System.out.println("ProductA create, name=" + name);
    }

    @Override
    public void doSomething() {
        System.out.println("ProductA doSomething, name=" + name);
    }
}
