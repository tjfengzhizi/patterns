package com.jun.structural.decorator.v2;

/**
 * @author：cj
 * @date：2020-7-9 19:27
 * @desc：
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
