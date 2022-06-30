package com.liziczh.designpattern.structural.flyweight.impl;

import com.liziczh.designpattern.structural.flyweight.IFlyweight;

/**
 * 具体享元
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 2:24 PM
 */
public class Flyweight implements IFlyweight {

    /**
     * 内部状态
     */
    private String intrinsicState;

    public Flyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operate(String extrinsicState) {
        System.out.println("Flyweight.op, flyweight=" + this);
        System.out.println("Flyweight.op, intrinsicState=" + intrinsicState);
        System.out.println("Flyweight.op, extrinsicState=" + extrinsicState);
    }
}
