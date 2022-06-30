package com.liziczh.designpattern.zpractice.pool.impl;

import java.util.concurrent.LinkedBlockingDeque;

import com.liziczh.designpattern.zpractice.pool.ObjectPool;
import com.liziczh.designpattern.zpractice.pool.PooledObjectFactory;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 3:51 PM
 */
public class GenericObjectPool<T> implements ObjectPool<T> {

    private int minIdle;
    private int maxIdle;
    private PooledObjectFactory<T> factory;
    private LinkedBlockingDeque<T> activeObjs;
    private LinkedBlockingDeque<T> idleObjs;

    public GenericObjectPool(PooledObjectFactory<T> factory) {
        this.minIdle = 0;
        this.maxIdle = 10;
        this.factory = factory;
        this.activeObjs = new LinkedBlockingDeque<T>();
        this.idleObjs = new LinkedBlockingDeque<T>();
    }

    @Override
    public void addObj(T target) {
        if (this.idleObjs.size() < maxIdle) {
            this.idleObjs.add(target);
        }
    }

    @Override
    public T borrowObj() {

        if (this.idleObjs.size() > 0) {
            T obj = this.idleObjs.poll();
            this.activeObjs.add(obj);
            return obj;
        }

        return null;
    }

    @Override
    public void returnObj(T obj) {
        if (this.idleObjs.size() < maxIdle) {
            this.idleObjs.add(obj);
        }
    }

    @Override
    public void invalidateObj(T obj) {
        this.idleObjs.remove(obj);
        this.activeObjs.remove(obj);
    }

    @Override
    public int getActiveNum() {
        return this.activeObjs.size();
    }

    @Override
    public int getIdleNum() {
        return this.idleObjs.size();
    }

    @Override
    public void refresh() {

    }

    @Override
    public void clear() {
        if (this.idleObjs != null && this.idleObjs.size() > 0) {
            for (T idleObj : this.idleObjs) {
                this.idleObjs.remove();
            }
        }

    }
}
