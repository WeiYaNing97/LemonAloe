package com.lemonaloe.web.controller.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtils {
    static Integer [] arr = {1,2,3,3,4,5,66};

    static Stream<Integer > intstream = Arrays.stream(arr);

    public static void main(String[] args) {

        System.out.println("=================================");
    }

    //过滤, >=3 并且  <=5
    public static List<Integer> filterate() {
        List<Integer> list = intstream.filter(a -> a>=3 && a<=5 ).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
        return list;
    }
    //过滤去重 filter distinct
    public static List<Integer> duplicateRemovalByDistinct() {
        //过滤并去重distinct
        List<Integer> distinctlist = intstream.filter(a -> a >= 3 && a <= 5).distinct().collect(Collectors.toList());
        distinctlist.stream().forEach(System.err::println);
        return distinctlist;
    }
    //过滤去重 filter toset
    public static Set<Integer> duplicateRemovalBytoSet() {
        //过滤并去重distinct
        Set<Integer> distinctlist = intstream.filter(a -> a >= 3 && a <= 5).collect(Collectors.toSet());
        distinctlist.stream().forEach(System.err::println);
        return distinctlist;
    }
}
