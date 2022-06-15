package com.liziczh.designpattern.chain.service;

import com.liziczh.designpattern.chain.Handler;
import com.liziczh.designpattern.chain.handler.AHandler;
import com.liziczh.designpattern.chain.handler.BHandler;
import com.liziczh.designpattern.chain.handler.CHandler;

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
