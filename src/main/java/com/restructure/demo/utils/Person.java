package com.restructure.demo.utils;

/**
 * @author .gang
 * @date 2022/2/21
 */
public class Person {


    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    /**
     * 重写toString方法
     */
    @Override
    public String toString() {
        return "(" + name + "," + age + ")";
    }

    /**
     * 重写equals方法
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //如果是同一个对象返回true，反之返回false
        if (this == obj) {
            return true;
        }
        // 判断是否类型相同
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return name.equals(person.name) && age == person.age;
    }

    /**
     * 重写hashCode方法
     */
    @Override
    public int hashCode() {
        int nameHash = name.toUpperCase().hashCode();
        return nameHash ^ age;
    }

}
