package com.jun.creational.strategy.s1;

/**
 * @author：cj
 * @date：2020-7-13 9:39
 * @desc：
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现策略");
    }
}
