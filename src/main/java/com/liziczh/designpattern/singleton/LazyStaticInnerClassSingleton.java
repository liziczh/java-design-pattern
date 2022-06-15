package com.liziczh.designpattern.singleton;

/**
 * 静态内部类懒加载线程安全的单例模式
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/1/17 12:00 上午
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

}
