package com.liziczh.designpattern.behavioral.observer.subscribe;

/**
 * 订阅者A
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 2:42 PM
 */
public class SubscriberA implements Subscriber {
    
    @Override
    public void update(String content) {
        System.out.println("SubscriberA update content=" + content);
    }
}
