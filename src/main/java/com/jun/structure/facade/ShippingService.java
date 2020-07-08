package com.jun.structure.facade;

/**
 * @author：cj
 * @date：2020-7-5 18:51
 * @desc：物流子系统
 */
public class ShippingService {
    String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+" 发货成功");
        return "物流单号：66666";
    }
}
