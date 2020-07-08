package com.jun.structure.facade;

/**
 * @author：cj
 * @date：2020-7-5 18:50
 * @desc：支付子系统
 */
public class PaymentService {
    Boolean pay(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+" 积分兑换成功");
        return true;
    }
}
