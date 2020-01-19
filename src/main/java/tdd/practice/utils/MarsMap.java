package tdd.practice.utils;

import java.util.ArrayList;
import java.util.List;

public class MarsMap {
    private List<Coordinate> ditches = new ArrayList<Coordinate>();

    public List<Coordinate> getDitches() {
        return ditches;
    }

    public void markDitch(Coordinate coordinate) {
        ditches.add(coordinate);
    }
}
