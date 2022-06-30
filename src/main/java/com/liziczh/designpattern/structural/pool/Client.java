package com.liziczh.designpattern.structural.pool;

import com.liziczh.designpattern.structural.pool.impl.GenericObjectPool;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 5:10 PM
 */
public class Client {
    public static void main(String[] args) {
        ObjectPool<String> pool = new GenericObjectPool<String>(new BasePooledObjectFactory<String>());
        String abc = "abc";
        pool.addObj(abc);
        pool.addObj(abc);
        pool.addObj(abc);

        System.out.println(pool.borrowObj());
        pool.returnObj(abc);
        System.out.println(pool.borrowObj());
        System.out.println(pool.borrowObj());
        System.out.println(pool.borrowObj());
        System.out.println(pool.borrowObj());
    }
}
