package com.jun.structural.decorator.v1;

/**
 * @author：cj
 * @date：2020-7-9 18:43
 * @desc：
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
