package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        //1) using java 8 with for each loop and lambda expression:
        System.out.println("--print using for each with lambda in java 8--");
        tvSeries.forEach(shows->{
            System.out.println(shows);
        });

        //2) using iterator
        System.out.println("--print using iterator--");
        Iterator<String> it = tvSeries.iterator();
        while(it.hasNext()){
            String shows = it.next();
            System.out.println(shows);
        }

        //3) using iterator and java 8 forEachRemaining() method
        System.out.println("--using iterator and java 8 forEachRemaining() method--");

        it = tvSeries.iterator();
        it.forEachRemaining(show->{
            System.out.println(show);
        });

        //4) using for each loop:
        System.out.println("--using for each loop--");
        for(String str: tvSeries){
            System.out.println(str);
        }

        //5) using index for loop
        System.out.println("--using index based for loop--");
        for(int i=0;i<tvSeries.size();i++){
            System.out.println(tvSeries.get(i));
        }

        //6) using a listIterator() to traverse in both directions
        System.out.println("--using a listIterator() to traverse in both directions--");
        ListIterator<String> tvSeriesListIterator =tvSeries.listIterator(tvSeries.size());
        while(tvSeriesListIterator.hasPrevious()){
            String show = tvSeriesListIterator.previous();
            System.out.println(show);
        }

    }
}
