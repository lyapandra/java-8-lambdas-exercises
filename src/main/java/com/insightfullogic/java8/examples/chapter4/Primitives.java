package com.insightfullogic.java8.examples.chapter4;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;

import java.util.IntSummaryStatistics;

public class Primitives {

    public static void printTrackLengthStatistics(Album album) {
    IntSummaryStatistics trackLengthStats
            = album.getTracks()
                   .mapToInt(track -> track.getLength())
                   .summaryStatistics()
            ;

    System.out.printf("Total %d tracks, Max: %d, Min: %d, Ave: %f, Sum: %d",
            trackLengthStats.getCount(),
            trackLengthStats.getMax(),
            trackLengthStats.getMin(),
            trackLengthStats.getAverage(),
                      trackLengthStats.getSum());
}

    public static void main(String[] args) {
        printTrackLengthStatistics(SampleData.aLoveSupreme);
    }
}
