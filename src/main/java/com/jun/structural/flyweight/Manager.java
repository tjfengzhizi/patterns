package com.jun.structural.flyweight;

/**
 * @author：cj
 * @date：2020-7-12 9:36
 * @desc：
 */
public class Manager implements Employee{
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println("报告内容："+this.reportContent);
    }
}
