package com.liziczh.designpattern.zpractice.pool;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 5:10 PM
 */
public class BasePooledObjectFactory<T> implements PooledObjectFactory<T> {
    @Override
    public PooledObject<T> makeObject() {
        return null;
    }

    @Override
    public void destroyObject(PooledObject<T> p) {

    }

    @Override
    public boolean validateObject(PooledObject<T> p) {
        return false;
    }

    @Override
    public void activateObject(PooledObject<T> p) {

    }

    @Override
    public void passivateObject(PooledObject<T> p) {

    }
}
