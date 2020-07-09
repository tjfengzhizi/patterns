package com.jun.structure.decorator.v2;

/**
 * @author：cj
 * @date：2020-7-9 19:23
 * @desc：
 */
public class Battercake extends ABattercake {
    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 1;
    }
}
