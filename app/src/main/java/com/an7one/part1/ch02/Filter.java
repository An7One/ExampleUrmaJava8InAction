package com.an7one.part1.ch02;

import com.an7one.part1.ch02.model.Apple;
import com.an7one.part1.ch02.predicate.ApplePredicate;
import com.an7one.util.Constant;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings(Constant.Annotation.UNUSED)
public class Filter {

    // to filter by abstract criteria
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) // the predicate object encapsulates the condition to test on an apple
                apples.add(apple);
        }

        return apples;
    }
}
