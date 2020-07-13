package com.jun.behavioral.templatemethod;

/**
 * @author：cj
 * @date：2020-7-13 10:13
 * @desc：
 */
public abstract class ACourse {
    //修饰为final不允许子类修改已经定义好的算法流程等
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if (this.needMakeArticle()){
            this.makeArticle();
        }
        this.packageCourse();
    }

    protected final void makePPT(){
        System.out.println("制作ppt");
    }

    protected final void makeVideo(){
        System.out.println("制作视频");
    }

    protected final void makeArticle(){
        System.out.println("制作手记");
    }

    //钩子方法
    protected Boolean needMakeArticle(){
        return false;
    }

    abstract void packageCourse();
}
