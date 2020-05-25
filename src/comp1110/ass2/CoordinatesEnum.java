/**
 Enum CoordinatesEnum is authored by Chan Xu, u7076870
 */
package comp1110.ass2;

import java.util.Arrays;
import java.util.List;

public enum CoordinatesEnum {

    Top("Coordinates on the top row", Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7)),
    Bottom("Coordinates on the bottom row", Arrays.asList(70, 71, 72, 73, 74, 75, 76, 77)),
    Right("Coordinates on the right column", Arrays.asList(7, 17, 27, 37, 47, 57, 67, 77)),
    Left("Coordinates on the left column", Arrays.asList(0, 10, 20, 30, 40, 50, 60, 70)),
    Surround("Coordinates on edge of the board", Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 10, 20, 30, 40, 50, 60, 70, 17, 27, 37, 47, 57, 67, 71, 72, 73, 74, 75, 76, 77)),
    All("All Coordinates", Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7,
            10, 11, 12, 13, 14, 15, 16, 17,
            20, 21, 22, 23, 24, 25, 26, 27,
            30, 31, 32, 35, 36, 37,
            40, 41, 42, 45, 46, 47,
            50, 51, 52, 53, 54, 55, 56, 57,
            60, 61, 62, 63, 64, 65, 66, 67,
            70, 71, 72, 73, 74, 75, 76, 77));

    private final String longName;
    private final List<Integer> coordinates;
    CoordinatesEnum(String name, List<Integer> coordinates) {
        this.longName = name;
        this.coordinates = coordinates;
    }
    public List<Integer> getCoordinates(){
        return coordinates;
    }

    public String getLongName(){
        return longName;
    }
}
