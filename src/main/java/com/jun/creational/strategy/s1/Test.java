package com.jun.creational.strategy.s1;

/**
 * @author：cj
 * @date：2020-7-13 9:43
 * @desc：策略模式
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        promotionActivity.execute();

        PromotionActivity promotionActivity1 = new PromotionActivity(new ManJianPromotionStrategy());
        promotionActivity1.execute();
    }
}
