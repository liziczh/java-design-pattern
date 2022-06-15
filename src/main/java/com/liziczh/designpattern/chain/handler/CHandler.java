package com.liziczh.designpattern.chain.handler;

import com.liziczh.designpattern.chain.Handler;

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
        context = "C";
        System.out.println("do C something... context=" + context);
    }
}
