package com.liziczh.designpattern.creational.factory.abstractfactory.product;

/**
 * 产品B
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 11:20 上午
 */
public class ProductXB implements IProductB {

    private String name;

    private String brand;

    @Override
    public void doB() {
        System.out.println("ProductXB doB");
    }
}
