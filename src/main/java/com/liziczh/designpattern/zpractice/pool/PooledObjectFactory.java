
package com.liziczh.designpattern.zpractice.pool;

/**
 * 池化对象工厂
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 4:27 PM
 */
public interface PooledObjectFactory<T> {

    /**
     * 创建一个池对象
     *
     * @param
     * @return com.liziczh.designpattern.zpractice.pool.PooledObject<T>
     * @author chenzhehao
     * @date 2022/6/30 7:39 PM
     */
    PooledObject<T> makeObject() throws Exception;

    /**
     * 销毁对象
     *
     * @param p
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 7:39 PM
     */
    void destroyObject(PooledObject<T> p) throws Exception;

    /**
     * 验证对象是否可用
     *
     * @param p
     * @return boolean
     * @author chenzhehao
     * @date 2022/6/30 7:39 PM
     */
    boolean validateObject(PooledObject<T> p);

    /**
     * 激活对象，从池中取对象时会调用此方法
     *
     * @param p
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 7:39 PM
     */
    void activateObject(PooledObject<T> p) throws Exception;

    /**
     * 钝化对象，向池中返还对象时会调用此方法
     *
     * @param p
     * @return void
     * @author chenzhehao
     * @date 2022/6/30 7:39 PM
     */
    void passivateObject(PooledObject<T> p) throws Exception;

}
