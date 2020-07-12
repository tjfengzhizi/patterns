package com.jun.structure.composite;

/**
 * @author：cj
 * @date：2020-7-12 8:16
 * @desc：组合模式
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent mainCatalog = new CourseCatalog("主目录",1);

        CatalogComponent javaCatalog = new CourseCatalog("java目录",2);

        CatalogComponent javaCourse1 = new Course("java课程1",11);
        CatalogComponent javaCourse2 = new Course("java课程2",22);

        javaCatalog.add(javaCourse1);
        javaCatalog.add(javaCourse2);

        CatalogComponent vueCatalog = new CourseCatalog("vue目录",2);

        CatalogComponent vueCourse1 = new Course("vue课程1",33);
        CatalogComponent vueCourse2 = new Course("vue课程2",44);

        vueCatalog.add(vueCourse1);
        vueCatalog.add(vueCourse2);

        mainCatalog.add(javaCatalog);
        mainCatalog.add(vueCatalog);

        mainCatalog.print();

    }
}
