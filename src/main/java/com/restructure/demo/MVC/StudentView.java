package com.restructure.demo.MVC;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author .gang
 * @date 2023/3/1
 */
public class StudentView {
    public Map printStudentDetails(String studentName, String studentRollNo){
        //HashMap、Hashtable不是有序的;
        // TreeMap和LinkedHashMap是有序的
        Map map = new LinkedHashMap();
        map.put("Name",studentName);
        map.put("Roll_No",studentRollNo);
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll_No: " + studentRollNo);
        return map;
    }
}
