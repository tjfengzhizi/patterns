package com.jun.structural.decorator.v2;

/**
 * @author：cj
 * @date：2020-7-9 19:28
 * @desc：
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+3;
    }
}
