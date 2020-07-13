package com.jun.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author：cj
 * @date：2020-7-12 9:38
 * @desc：
 */
public class EmpolyeeFactory {
    private static final Map<String ,Manager> EMPLOYEE_MAP = new HashMap<>();
    public static Manager getManager(String department){
        Manager manager = EMPLOYEE_MAP.get(department);
        if (manager == null){
            manager = new Manager(department);
            EMPLOYEE_MAP.put(department,manager);
            System.out.println("新创建部门"+department);
            manager.setReportContent("报告的内容。。。。。");
        }
        return manager;
    }
}
