package com.liziczh.designpattern.creational.factory.simplefactory.product;

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

    @Override
    public void doSomething() {
        System.out.println("ProductA doA");
    }
}
