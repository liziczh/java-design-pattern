package com.liziczh.designpattern.structural.pool.impl;

import com.liziczh.designpattern.structural.pool.PooledObject;

/**
 * 池化对象
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 3:46 PM
 */
public class GenericPooledObject<T> implements PooledObject<T> {

    private int state;

    private T target;

}
