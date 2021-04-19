package com.an7one.example.part1.ch02;

import com.an7one.example.part1.ch02.model.Apple;
import com.an7one.example.part1.ch02.predicate.AppleRedAndHeavyPredicate;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple("red", 180),
                new Apple("red", 150),
                new Apple("green", 150)
        );

        List<Apple> redAndHeavyApples = Filter.filterApples(apples, new AppleRedAndHeavyPredicate());
    }
}
