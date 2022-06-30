package com.liziczh.designpattern.behavioral.chain.handler;

/**
 * 建造者+责任链模式
 * 应用：Filter
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 11:20 上午
 */
public abstract class Handler<T> {
    protected Handler<T> chain;

    protected void next(Handler<T> handler) {
        this.chain = handler;
    }

    protected abstract void doHandle(T t);

    public void execute(T t) {

        this.doHandle(t);

        if (chain != null) {
            chain.execute(t);
        }
    }

    public static <T> Handler.Builder<T> builder() {
        return new Handler.Builder<T>();
    }

    public static class Builder<T> {

        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> add(Handler<T> handler) {

            if (this.head == null) {
                this.head = this.tail = handler;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }

    }
}
