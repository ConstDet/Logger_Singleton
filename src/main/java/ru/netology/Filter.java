package ru.netology;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        return source.stream()
                .filter(f -> f > treshold)
                .collect(Collectors.toList());
    }
}
