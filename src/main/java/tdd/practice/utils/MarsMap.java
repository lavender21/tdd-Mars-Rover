package tdd.practice.utils;

import java.util.ArrayList;
import java.util.List;

public class MarsMap {
    private List<Coordinate> ditches = new ArrayList<>();

    public List<Coordinate> getDitches() {
        return ditches;
    }

    public void markDitch(Coordinate coordinate) {
        ditches.add(coordinate);
    }

    public boolean isInDitch(Coordinate coordinate) {
        return ditches.stream().anyMatch(coordinate::equals);
    }
}
