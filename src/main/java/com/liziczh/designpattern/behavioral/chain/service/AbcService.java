package com.liziczh.designpattern.behavioral.chain.service;

import com.liziczh.designpattern.behavioral.chain.handler.Handler;
import com.liziczh.designpattern.behavioral.chain.handler.impl.AHandler;
import com.liziczh.designpattern.behavioral.chain.handler.impl.BHandler;
import com.liziczh.designpattern.behavioral.chain.handler.impl.CHandler;

/**
 * A
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 12:34 下午
 */
public class AbcService {

    public void execute() {

        Handler<String> handler = Handler.<String>builder()
                .add(new AHandler())
                .add(new BHandler())
                .add(new CHandler())
                .build();

        handler.execute("go");

    }

    public static void main(String[] args) {
        new AbcService().execute();
    }

}
