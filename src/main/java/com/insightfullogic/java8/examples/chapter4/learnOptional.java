package com.insightfullogic.java8.examples.chapter4;

import java.util.Optional;

public class learnOptional {
    public static void main(String[] args) {
        Optional<String> a = Optional.of("a");
        System.out.println("a = " + a);
        System.out.println("a.toString() = " + a.toString());
        System.out.println("a.get() = " + a.get());
        System.out.println("===========");
Optional alsoEmpty = Optional.ofNullable(null);
        System.out.println("alsoEmpty = " + alsoEmpty);
//        System.out.println("alsoEmpty.get() = " + alsoEmpty.get());
        System.out.println("===========");

        Optional emptyOptional = Optional.empty();
//        System.out.println("emptyOptional = " + emptyOptional);
//        System.out.println("emptyOptional.get() = " + emptyOptional.get());
        System.out.println("===========");
        System.out.println("emptyOptional.isPresent() = " + emptyOptional.isPresent());
        System.out.println("alsoEmpty.isPresent() = " + alsoEmpty.isPresent());
        System.out.println("===========");
        System.out.println("emptyOptional.orElseGet(() -> \"c\") = " + emptyOptional.orElseGet(() -> "c"));
        System.out.println("a.orElseGet(() -> \"c\") = " + a.orElseGet(() -> "c"));
    }
}
