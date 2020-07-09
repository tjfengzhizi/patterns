package com.jun.structure.adapter.objectadapter;

/**
 * @author：cj
 * @date：2020-7-9 18:07
 * @desc：适配类
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();
    }
}
