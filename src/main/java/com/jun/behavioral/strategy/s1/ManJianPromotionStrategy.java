package com.jun.behavioral.strategy.s1;

/**
 * @author：cj
 * @date：2020-7-13 9:40
 * @desc：
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减策略");
    }
}
