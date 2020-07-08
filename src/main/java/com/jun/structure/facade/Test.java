package com.jun.structure.facade;

/**
 * @author：cj
 * @date：2020-7-5 19:01
 * @desc：外观模式（门面模式）
 */
public class Test {
    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        String orderId = giftExchangeService.giftExchange(new PointsGift("cj的100积分"));
        System.out.println(orderId);
    }
}
