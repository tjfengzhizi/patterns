package com.jun.structure.composite;

/**
 * @author：cj
 * @date：2020-7-12 8:05
 * @desc：
 */
public abstract class CatalogComponent {
    abstract void add(CatalogComponent catalogComponent);
    abstract void remove(CatalogComponent catalogComponent);
    abstract String getName(CatalogComponent catalogComponent);
    abstract double getPrice(CatalogComponent catalogComponent);
    abstract void print();
}
