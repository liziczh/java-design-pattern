package com.liziczh.designpattern.behavioral.observer.subscribe;

/**
 * 订阅者
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 2:43 PM
 */
public interface Subscriber {

    void update(String content);
}
