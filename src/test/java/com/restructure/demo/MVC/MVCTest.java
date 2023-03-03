package com.restructure.demo.MVC;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * @author .gang
 * @date 2023/3/2
 */
public class MVCTest {


    /**
     *查询数据并返回视图
     */
    @Test
    public void query() {
        //从数据库获取学生记录
        Student model  = retrieveStudentFromDatabase();
        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        Map map = controller.updateView();
        Assert.assertEquals("{Name=Robert, Roll_No=10}",map.toString());
    }

    /**
     *更新数据
     */
    @Test
    public void updte() {
        //从数据库获取学生记录
        Student model  = retrieveStudentFromDatabase();
        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        Map queryMap =  controller.updateView();
        Assert.assertEquals("{Name=Robert, Roll_No=10}",queryMap.toString());
        //更新模型数据
        controller.setStudentName("John");
        Map updateMap = controller.updateView();
        Assert.assertEquals("{Name=John, Roll_No=10}",updateMap.toString());

    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
