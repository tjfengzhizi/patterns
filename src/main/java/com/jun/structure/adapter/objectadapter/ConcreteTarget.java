package com.jun.structure.adapter.objectadapter;

/**
 * @author：cj
 * @date：2020-7-9 17:58
 * @desc：具体实现
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("具体的方法");
    }
}
