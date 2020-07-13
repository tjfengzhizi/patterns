package com.jun.behavioral.templatemethod;

/**
 * @author：cj
 * @date：2020-7-13 10:22
 * @desc：
 */
public class VueCourse extends ACourse {
    private Boolean flag;

    public VueCourse(Boolean flag) {
        this.flag = flag;
    }

    @Override
    void packageCourse() {
        System.out.println("制作前端独特的内容");
    }

    @Override
    protected Boolean needMakeArticle() {
        return flag;
    }
}
