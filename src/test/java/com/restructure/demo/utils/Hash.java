package com.restructure.demo.utils;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author .gang
 * @date 2022/2/21
 */
public class Hash {


    @Test
    public void hashAndEquals() {
        // 新建2个相同内容的Person对象，
        // 再用equals比较它们是否相等
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        Person p3 = new Person("aaa", 200);
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());
        System.out.printf("p1.equals(p3) : %s; p1(%d) p3(%d)\n", p1.equals(p3), p1.hashCode(), p3.hashCode());
    }

    @Test
    public void hashSet() {
        // 新建2个相同内容的Person对象，
        // 再用equals比较它们是否相等
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        Person p3 = new Person("aaa", 200);
        //新建HashSet对象
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        // 比较p1 和 p2， 并打印它们的hashCode()
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());
        // 打印set
        System.out.printf("set:%s\n", set);
    }


    /**
     * 重写hashcode
     */
    @Test
    public void OverrideHashCode() {
        // 新建2个相同内容的Person对象，
        // 再用equals比较它们是否相等
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        Person p3 = new Person("aaa", 200);
        //新建HashSet对象
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        // 比较p1 和 p2， 并打印它们的hashCode()
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());
        // 打印set
        System.out.printf("set:%s\n", set);
    }
}

