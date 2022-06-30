package com.liziczh.designpattern.structural.pool;

/**
 * 对象池
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 3:34 PM
 */
public interface ObjectPool<T> {

    /**
     * 添加对象
     *
     * @param obj
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 3:41 PM
     */
    void addObj(T obj);

    /**
     * 借出对象
     *
     * @param
     * @return T
     * @author chenzhehao
     * @date 2022/6/30 3:41 PM
     */
    T borrowObj();

    /**
     * 归还对象
     *
     * @param obj
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 3:41 PM
     */
    void returnObj(T obj);

    /**
     * 失效对象
     *
     * @param
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 3:43 PM
     */
    void invalidateObj(T obj);

    /**
     * 获取激活的对象数量
     *
     * @param
     * @return int
     * @author chenzhehao
     * @date 2022/6/30 3:43 PM
     */
    int getActiveNum();

    /**
     * 获取闲置的对象数量
     *
     * @param
     * @return int
     * @author chenzhehao
     * @date 2022/6/30 3:43 PM
     */
    int getIdleNum();

    /**
     * 刷新池内对象
     *
     * @param
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 3:42 PM
     */
    void refresh();

    /**
     * 清空池内对象
     *
     * @param
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 3:42 PM
     */
    void clear();

}
