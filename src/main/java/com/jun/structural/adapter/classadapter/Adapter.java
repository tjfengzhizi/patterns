package com.jun.structural.adapter.classadapter;

/**
 * @author：cj
 * @date：2020-7-9 18:00
 * @desc：适配类
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        //其他业务逻辑...
        super.adapteeRequest();
        //其他业务逻辑...
    }
}
