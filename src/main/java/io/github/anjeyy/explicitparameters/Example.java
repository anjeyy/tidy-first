package io.github.anjeyy.explicitparameters;

import java.util.Map;

class Example {

    void before(Map<String, Integer> params) {
        Integer a = params.get("a");
        Integer b = params.get("b");

        if (a + b > 0) {
            System.out.println("Positive.");
        }
    }

    void afterFirst(Map<String, Integer> params) {
        Integer a = params.get("a");
        Integer b = params.get("b");

        afterSecond(a, b);
    }

    void afterSecond(Integer a, Integer b) {
        if (a + b > 0) {
            System.out.println("Positive.");
        }
    }
}
