package com.liziczh.designpattern.structural.flyweight.facotry;

import java.util.HashMap;
import java.util.Map;

import com.liziczh.designpattern.structural.flyweight.IFlyweight;
import com.liziczh.designpattern.structural.flyweight.impl.Flyweight;

/**
 * 享元工厂
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 2:10 PM
 */
public class FlyweightFactory {

    private static Map<String, IFlyweight> pool = new HashMap<String, IFlyweight>();

    public static IFlyweight get(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            pool.put(intrinsicState, new Flyweight(intrinsicState));
        }
        return pool.get(intrinsicState);
    }

}
