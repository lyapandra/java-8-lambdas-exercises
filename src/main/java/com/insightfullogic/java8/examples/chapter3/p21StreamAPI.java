package com.insightfullogic.java8.examples.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Track;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.*;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class p21StreamAPI {
    public static List<String> collectToList() {
        List<String> collected = Stream.of("a", "b", "c") // <1>
                .collect(Collectors.toList()); // <2>
        return collected;
    }

    public static List<String> mapToUpperCase() {
        List<String> collected = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(toList());
        return collected;
    }

    public static List<String> functionalStringsWithNumbers() {
        List<String> beginningWithNumbers
                = Stream.of("a", "1abc", "1Abc", "12 bc", "1A bc", "1Aabc", "abc1", "z2z")
                .filter(value -> isDigit(value.charAt(0)))
                .filter(value -> isAlphabetic(value.charAt(1)))
                .filter(value -> isUpperCase(value.charAt(1)))
                .filter(value -> isSpaceChar(value.charAt(2)))
                .collect(toList());
        return beginningWithNumbers;
    }

    public static List<Integer> flatMapCharacters() {
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());
        return together;
    }
    public static String streamsMaxLength() {
        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));


        String longestTrack = tracks.stream()
                .max(Comparator.comparing(track -> track.getLength()))
                .get().getName();
        return longestTrack;
    }

    public static int sumUsingReduce() {
        int count = Stream.of(1, 2, 3)
                .reduce(10, (acc, element) -> acc + element);
    return count;
    }
        public static void main(String[] args) {
        System.out.println("collectToList() = " + collectToList());
        System.out.println("mapToUpperCase() = " + mapToUpperCase());
        System.out.println("functionalStringsWithNumbers() = " + functionalStringsWithNumbers());
        System.out.println("flatMapCharacters()  = " + flatMapCharacters());
        System.out.println("streamsMaxLength()  = " + streamsMaxLength());
            System.out.println("sumUsingReduce()  = " + sumUsingReduce());
    }
}
