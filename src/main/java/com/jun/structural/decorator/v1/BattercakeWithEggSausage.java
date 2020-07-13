package com.jun.structural.decorator.v1;

/**
 * @author：cj
 * @date：2020-7-9 18:44
 * @desc：
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 3;
    }
}
