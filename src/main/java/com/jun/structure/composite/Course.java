package com.jun.structure.composite;

/**
 * @author：cj
 * @date：2020-7-12 8:09
 * @desc：
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void add(CatalogComponent catalogComponent) {

    }

    void remove(CatalogComponent catalogComponent) {

    }

    String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    void print() {
        System.out.println("名称:"+this.name+","+"价格:"+this.price);
    }
}
