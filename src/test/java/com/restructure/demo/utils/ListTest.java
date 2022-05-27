package com.restructure.demo.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author .gang
 * @date 2022/2/21
 */
public class ListTest {

    /**
     * subList() 返回的是 ArrayList 的内部类 SubList，并不是 ArrayList 本身，
     * 而是 ArrayList 的一个视图，对于 SubList 的所有操作最终会反映到原列表上。
     */
    @Test
    public void subList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        List<Integer> list = arrayList.subList(0, 3);
        System.out.println(list.toString());
    }


    @Test
    public void emptyList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list = Collections.emptyList();
        System.out.println(list);
        list.add(3);
    }


    @Test
    public void singletonList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        //此方法将对象o作为要存储在返回列表中的参数。
        //此方法返回一个仅包含指定对象的不可变列表。
        list = Collections.singletonList(2);
        System.out.println(list);
        list.add(4);
    }


    @Test
    public void subListConcurrentModificationException() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        List<Integer> list = arrayList.subList(0, 3);
        System.out.println(list.toString());
        for (Integer integer : list) {
            System.out.println(" " + integer);
        }
        System.out.println(" modify arrayList");
        arrayList.remove(0);

        for (Integer integer : list) {
            System.out.println(" " + integer);
        }

    }

    @Test
    public void toArray() {
        List<String> list = new ArrayList<>(2);
        list.add("guan");
        list.add("bao");
        String[] array = list.toArray(new String[0]);
        Arrays.stream(array).forEach(System.out::println);
    }


    @Test(expected = NullPointerException.class)
    public void addAll() {
        List<String> nullList = null;
        if (nullList.isEmpty()) {
            System.out.println(1111);
        }
    }

    @Test
    public void asList() {
        String[] str = new String[]{"a", "b", "c"};
        List list = Arrays.asList(str);
        //添加数据
        //修改前
        //list.add("yangguanbao");
        //修改后
        List<String> numberList = new ArrayList(Arrays.asList(str));
        numberList.add("e");
        System.out.println(numberList.toString());
        str[0] = "d";
        System.out.println(list.toString());
    }


}
