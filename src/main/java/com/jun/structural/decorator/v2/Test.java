package com.jun.structural.decorator.v2;

/**
 * @author：cj
 * @date：2020-7-9 19:29
 * @desc：装饰者模式，动态添加
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+" "+aBattercake.cost());
    }
}
