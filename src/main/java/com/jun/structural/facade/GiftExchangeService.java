package com.jun.structural.facade;

/**
 * @author：cj
 * @date：2020-7-5 18:54
 * @desc：门面类
 */
public class GiftExchangeService {
    //封装一些常量
    private static final String PROMPT_MESSAGE = "非常抱歉，兑换不了了呀";
    //相当于类似spring注入到容器的方式
    CheckService checkService = new CheckService();
    PaymentService paymentService = new PaymentService();
    ShippingService shippingService = new ShippingService();

    String giftExchange(PointsGift pointsGift){
        if(checkService.isAvailable(pointsGift)){
            if(paymentService.pay(pointsGift)){
                return shippingService.shipGift(pointsGift);
            }else{
                return PROMPT_MESSAGE;
            }
        }else{
            return PROMPT_MESSAGE;
        }
    }
}