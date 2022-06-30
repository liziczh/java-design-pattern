package com.liziczh.designpattern.structural.flyweight;

/**
 * 抽象享元
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 2:30 PM
 */
public interface IFlyweight {
    
    /**
     * 外部状态
     *
     * @param extrinsicState
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 3:11 PM
     */
    void operate(String extrinsicState);
}
