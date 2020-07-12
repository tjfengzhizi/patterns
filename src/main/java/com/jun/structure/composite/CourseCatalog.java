package com.jun.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：cj
 * @date：2020-7-12 8:08
 * @desc：
 */
public class CourseCatalog extends CatalogComponent {
    List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    double getPrice(CatalogComponent catalogComponent) {
        return 0;
    }

    void print() {
        System.out.println(this.name);
        items.forEach(catalog->{
            if (level !=null)
                for (int i = 0; i <level ; i++) {
                    System.out.print(" ");
                }
            catalog.print();
        });
    }
}
