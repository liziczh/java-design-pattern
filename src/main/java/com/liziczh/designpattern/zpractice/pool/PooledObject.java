
package com.liziczh.designpattern.zpractice.pool;

/**
 * 池化对象
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 3:46 PM
 */
public interface PooledObject<T> {

    /**
     * 获取封装的对象
     *
     * @param
     * @return T
     * @author chenzhehao
     * @date 2022/6/30 7:40 PM
     */
    T getObject();

    /**
     * 获取池化对象状态
     *
     * @param
     * @return int
     * @author chenzhehao
     * @date 2022/6/30 7:40 PM
     */
    int getState();

    /**
     * 对象创建的时间
     *
     * @param
     * @return long
     * @author chenzhehao
     * @date 2022/6/30 7:40 PM
     */
    long getCreateTime();

}
