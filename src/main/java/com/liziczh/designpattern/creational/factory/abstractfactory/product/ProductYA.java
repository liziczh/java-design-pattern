package com.liziczh.designpattern.creational.factory.abstractfactory.product;

/**
 * 产品A
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 11:20 上午
 */
public class ProductYA implements IProductA {

    private String name;

    private String brand;

    @Override
    public void doA() {
        System.out.println("ProductYA doA");
    }
}
