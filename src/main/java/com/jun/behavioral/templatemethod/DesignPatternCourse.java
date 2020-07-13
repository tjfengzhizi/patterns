package com.jun.behavioral.templatemethod;

/**
 * @author：cj
 * @date：2020-7-13 10:18
 * @desc：
 */
public class DesignPatternCourse extends ACourse {
    @Override
    protected Boolean needMakeArticle() {
        return true;
    }

    @Override
    void packageCourse() {
        System.out.println("制作独特的内容");
    }
}
