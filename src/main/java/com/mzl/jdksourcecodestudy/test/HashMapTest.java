package com.mzl.jdksourcecodestudy.test;

import java.util.HashMap;

/**
 * @ClassName: HashMapTest
 * @Description: HashMap源码
 * @Author: mzl
 * @CreateDate: 2023/11/1 18:21
 * @Version: 1.0
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        hashMap.put("1", 1);
        hashMap.put("2", 2);
        hashMap.put("3", 3);
    }

}