package com.jun.behavioral.templatemethod;

/**
 * @author：cj
 * @date：2020-7-13 10:22
 * @desc：模版方法模式
 */
public class Test {
    public static void main(String[] args) {
        ACourse aCourse = new DesignPatternCourse();
        aCourse.makeCourse();

        System.out.println();

        ACourse aCourse1 = new VueCourse(true);
        aCourse1.makeCourse();
    }
}
