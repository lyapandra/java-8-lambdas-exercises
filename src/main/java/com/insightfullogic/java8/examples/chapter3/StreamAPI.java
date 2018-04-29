package com.insightfullogic.java8.examples.chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static List<String> collectToList() {
        // BEGIN collect_to_list_1
        List<String> collected = Stream.of("a", "b", "c") // <1>
                .collect(Collectors.toList()); // <2>
        return collected;
    }

    public static void main(String[] args) {
        System.out.println("collectToList() = " + collectToList());
    }
}
