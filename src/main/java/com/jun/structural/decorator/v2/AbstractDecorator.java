package com.jun.structural.decorator.v2;

/**
 * @author：cj
 * @date：2020-7-9 19:24
 * @desc：
 */
public abstract class AbstractDecorator extends ABattercake{
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}
