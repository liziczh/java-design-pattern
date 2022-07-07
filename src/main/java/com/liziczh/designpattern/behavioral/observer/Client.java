package com.liziczh.designpattern.behavioral.observer;

import com.liziczh.designpattern.behavioral.observer.publish.Publisher;
import com.liziczh.designpattern.behavioral.observer.subscribe.SubscriberA;
import com.liziczh.designpattern.behavioral.observer.subscribe.SubscriberB;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 2:56 PM
 */
public class Client {

    public static void main(String[] args) {
        // 初始化
        Publisher publisher = new Publisher();
        publisher.addSubscriber(new SubscriberA());
        publisher.addSubscriber(new SubscriberB());

        // 发布
        publisher.publish("publish something...");
    }
}
