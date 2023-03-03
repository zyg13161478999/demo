package com.restructure.demo.TransferObjectPattern;


import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

/**
 * @author .gang
 * @date 2023/1/10
 */
public class TransferObjectPatternDemo {

    @Test
    public void test_update() {
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }
        //更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //获取学生
        studentBusinessObject.getStudent(0);
        Assert.assertEquals("Michael",student.getName());
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }

    @Test
    public void test_delete() {
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }
        Assert.assertEquals(2,studentBusinessObject.getAllStudents().size());
        //删除学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setRollNo(0);
        studentBusinessObject.deleteStudent(student);

        Assert.assertEquals(1,studentBusinessObject.getAllStudents().size());
        for (StudentVO studentVo : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +studentVo.getRollNo()+", Name : "+studentVo.getName()+" ]");
        }
    }

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
    }
}