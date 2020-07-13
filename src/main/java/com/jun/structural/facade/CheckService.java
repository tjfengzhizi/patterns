package com.jun.structural.facade;

/**
 * @author：cj
 * @date：2020-7-5 18:47
 * @desc：积分校验子系统
 */
public class CheckService {
    Boolean isAvailable(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+" 积分校验通过");
        return true;
    }
}
