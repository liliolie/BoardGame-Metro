package comp1110.ass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tiles {
    public static List<String> placedTiles(String placementSequence) {
        String tilesString = placementSequence.replaceAll("([0-7][0-7])", ",");
        String[] tilesArray = tilesString.split(",");
        return new ArrayList<>(Arrays.asList(tilesArray));
    }
}