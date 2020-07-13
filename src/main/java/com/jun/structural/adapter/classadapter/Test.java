package com.jun.structural.adapter.classadapter;

/**
 * @author：cj
 * @date：2020-7-9 18:01
 * @desc：类适配器，通过继承的方式实现
 */
public class Test extends ConcreteTarget {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();
    }
}
