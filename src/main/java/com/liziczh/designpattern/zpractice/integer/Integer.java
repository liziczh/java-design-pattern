package com.liziczh.designpattern.zpractice.integer;

/**
 * JDK源码Integer.valueOf缓存-128～127
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/30 7:43 PM
 */
public class Integer {

    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public static Integer valueOf(int value) {
        if (value >= -128 && value <= 127) {
            return IntegerCache.CACHE[value + 128];
        }
        return new Integer(value);
    }

    /**
     * Integer常用值[-128~127]缓存
     *
     * @author chenzhehao
     * @date 2022/6/30 7:56 PM
     */
    public static class IntegerCache {
        public static final Integer[] CACHE = new Integer[128 + 1 + 127];

        static {
            for (int i = 0; i < 128 + 1 + 127; i++) {
                CACHE[i] = new Integer(i - 128);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf(1));
        System.out.println(Integer.valueOf(1));
        System.out.println(Integer.valueOf(127));
        System.out.println(Integer.valueOf(127));
        System.out.println(Integer.valueOf(128));
        System.out.println(Integer.valueOf(128));
    }

}
