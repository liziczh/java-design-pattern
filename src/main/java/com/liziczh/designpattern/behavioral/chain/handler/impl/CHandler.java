package com.liziczh.designpattern.behavioral.chain.handler.impl;

import com.liziczh.designpattern.behavioral.chain.handler.Handler;

/**
 * A
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 12:34 下午
 */
public class CHandler extends Handler<String> {

    @Override
    public void doHandle(String context) {
        context = context + "C";
        System.out.println("CHandler: do something... context=" + context);
    }
}
