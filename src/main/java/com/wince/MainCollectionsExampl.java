package com.wince;


import java.util.Arrays;
import java.util.Collection;

import java.util.TreeSet;

public class MainCollectionsExampl {
    public static void main(String[] args) {
        Collection<String> list = new TreeSet<>();

        String[] names = { "Anna", "Bob", "Carol", "David", "Edna" };
        list.addAll(Arrays.asList(names));

        System.out.println(list);

        list.add("Fred");

        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');

        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));
    }
}