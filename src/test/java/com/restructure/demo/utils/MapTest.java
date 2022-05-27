package com.restructure.demo.utils;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author .gang
 * @date 2022/2/21
 */
public class MapTest {

    /**
     * 在使用 java.util.stream.Collectors 类的 toMap() 方法转为 Map 集合时，一定要注意当 value 为 null 时会抛 NPE 异常。
     */
    @Test
    public void toMap() {
        String[] departments = new String[]{"RDC", "RDC", "KKB"};
        // 抛出 IllegalStateException 异常
        Map<Integer, String> map = Arrays.stream(departments).collect(Collectors.toMap(String::hashCode, str -> str,(oldValue,newValue)->newValue));
        System.out.println(map.toString());
    }

    @Test
    public void keySet() {
        Map map = new HashMap();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        Set set = map.keySet();
        map.put(4,4);
        System.out.println(set.toString());
        Collection values = map.values();
        System.out.println(values.toString());
        Set set1 = map.entrySet();
        System.out.println(set1.toString());
    }
}
