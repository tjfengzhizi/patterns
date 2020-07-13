package com.jun.structural.flyweight;

/**
 * @author：cj
 * @date：2020-7-12 9:49
 * @desc：享元模式
 */
public class Test {
    public static void main(String[] args) {
        Manager kf = EmpolyeeFactory.getManager("KF");
        kf.report();

        Manager kf1 = EmpolyeeFactory.getManager("KF");
        kf1.report();

        Manager cp = EmpolyeeFactory.getManager("CP");
        cp.report();
    }
}
