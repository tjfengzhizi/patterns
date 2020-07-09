package com.jun.structure.decorator.v1;

/**
 * @author：cj
 * @date：2020-7-9 18:45
 * @desc：装饰器模式，通过继承的方式在不改变原有对象的基础上扩展功能
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" "+battercake.cost());

        Battercake battercake1 = new BattercakeWithEgg();
        System.out.println(battercake1.getDesc()+" "+battercake1.cost());

        Battercake battercake2 = new BattercakeWithEggSausage();
        System.out.println(battercake2.getDesc()+" "+ battercake2.cost());
    }
}
