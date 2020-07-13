package com.jun.structural.adapter.objectadapter;

/**
 * @author：cj
 * @date：2020-7-9 18:01
 * @desc：对象适配器，通过对象组合的方式实现，优先使用组合方式
 * 注：主要学习其思想
 */
public class Test extends ConcreteTarget {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();
    }
}
