package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

class Main {
    public static void  main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> IntegerArrayList = new ArrayList<>();
    }
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
