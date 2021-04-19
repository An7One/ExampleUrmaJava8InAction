package com.an7one.example.part1.ch02.predicate;

import com.an7one.example.part1.ch02.model.Apple;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
