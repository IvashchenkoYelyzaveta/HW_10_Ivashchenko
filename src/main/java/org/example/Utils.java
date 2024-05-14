package org.example;

import java.util.ArrayList;
import java.util.List;

public final class Utils {

    private Utils() {
    }

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {

        List<Integer> oddNumber = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumber.add(number);
            }
        }
        return oddNumber;
    }


    public static List<String> convertToStringList (List<Integer> numbers) {

        List<String> stringList = new ArrayList<>();

        for (int number : numbers) {
            stringList.add(Integer.toString(number));
        }
        return stringList;
    }


    public static List<String> doubling(List<String> strings) {

        List<String> stringDoubling = new ArrayList<>();

        for (String str : strings) {
            stringDoubling.add(str + str);
        }
        return stringDoubling;
    }


}
