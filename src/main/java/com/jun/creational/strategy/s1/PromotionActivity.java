package com.jun.creational.strategy.s1;

/**
 * @author：cj
 * @date：2020-7-13 9:41
 * @desc：
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }
}
