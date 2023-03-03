package com.restructure.demo.MVC;

import java.util.Map;

/**
 * @author .gang
 * @date 2023/3/1
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public Map updateView(){
        return  view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
