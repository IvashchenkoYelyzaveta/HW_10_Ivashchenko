package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.add("One");
    list.add("Two");
    list.add("Three");


    for (int i=0; i< list.size(); i++) {
        System.out.println(list.get(i));
    }

        System.out.println(); //пустая строка для лучшей читаемости

    for (String number : list) {
        System.out.println(number);
    }

        System.out.println();

    int i = 0;
    while (i < list.size()) {
        System.out.println(list.get(i));
        i++;
    }

        System.out.println();

    Iterator<String> iterator = list.iterator();

    while (iterator.hasNext()) {
        String fruit = iterator.next();
        System.out.println(fruit);
    }


        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);

        int sum = Utils.getSum(list2);
        System.out.println(sum);

        List<Integer> oddNumber = Utils.getOddNumber(list2);
        for (int number : oddNumber) {
            System.out.println(number);
        }

        List<String> stringList = Utils.convertToStringList(list2);
        for (String stringNumber : stringList) {
            System.out.println(stringNumber);
        }

        List<String> stringDoubling = Utils.doubling(list);
        for (String str : stringDoubling) {
            System.out.println(str);
        }




    }
}