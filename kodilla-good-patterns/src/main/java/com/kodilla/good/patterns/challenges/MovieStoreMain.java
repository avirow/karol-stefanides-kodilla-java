package com.kodilla.good.patterns.challenges;


import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String value = movieStore.getMovies().values().stream()
                .flatMap(v -> v.stream())
                .collect(Collectors.joining("!"));
        System.out.println(value);
    }
}
