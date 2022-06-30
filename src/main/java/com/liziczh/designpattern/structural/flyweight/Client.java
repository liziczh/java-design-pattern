package com.liziczh.designpattern.structural.flyweight;

import com.liziczh.designpattern.structural.flyweight.facotry.FlyweightFactory;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 3:13 PM
 */
public class Client {

    public static void main(String[] args) {
        IFlyweight flyweight1 = FlyweightFactory.get("flyweight-1");
        IFlyweight flyweight2 = FlyweightFactory.get("flyweight-2");
        IFlyweight flyweight3 = FlyweightFactory.get("flyweight-1");
        flyweight1.operate("aaa");
        flyweight2.operate("bbb");
        flyweight3.operate("ccc");
    }

}
