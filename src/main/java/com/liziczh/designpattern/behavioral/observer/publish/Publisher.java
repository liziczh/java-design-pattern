package com.liziczh.designpattern.behavioral.observer.publish;

import java.util.ArrayList;
import java.util.List;

import com.liziczh.designpattern.behavioral.observer.subscribe.Subscriber;

/**
 * 发布者
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 2:41 PM
 */
public class Publisher {

    private final List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publish(String content) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(content);
        }
    }

}
