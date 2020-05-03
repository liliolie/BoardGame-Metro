package comp1110.ass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 (0,0)(0,1)(0,2)(0,3)(0,4)(0,5)(0,6)(0,7)
 (1,0)(1,1)(1,2)(1,3)(1,4)(1,5)(1,6)(1,7)
 (2,0)(2,1)(2,2)(2,3)(2,4)(2,5)(2,6)(2,7)
 (3,0)(3,1)(3,2)----------(3,5)(3,6)(3,7)
 (4,0)(4,1)(4,2)----------(4,5)(4,6)(4,7)
 (5,0)(5,1)(5,2)(5,3)(5,4)(5,5)(5,6)(5,7)
 (6,0)(6,1)(6,2)(6,3)(6,4)(6,5)(6,6)(6,7)
 (7,0)(7,1)(7,2)(7,3)(7,4)(7,5)(7,6)(7,7)
 */

public class Coordinates {
    public final static List<Integer> surroundingCoord = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 10, 20, 30, 40, 50, 60, 70, 17, 27, 37, 47, 57, 67, 71, 72, 73, 74, 75, 76, 77));
    public final static List<Integer> topCoord = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
    public final static List<Integer> rightCoord = new ArrayList<>(Arrays.asList(7, 17, 27, 37, 47, 57, 67, 77));
    public final static List<Integer> bottomCoord = new ArrayList<>(Arrays.asList(70, 71, 72, 73, 74, 75, 76, 77));
    public final static List<Integer> leftCoord = new ArrayList<>(Arrays.asList(0, 10, 20, 30, 40, 50, 60, 70));
    public final static List<String> allCoordinates = new ArrayList<>(Arrays.asList("00", "01", "02", "03", "04", "05", "06", "07",
            "10", "11", "12", "13", "14", "15", "16", "17",
            "20", "21", "22", "23", "24", "25", "26", "27",
            "30", "31", "32", "35", "36", "37",
            "40", "41", "42", "45", "46", "47",
            "50", "51", "52", "53", "54", "55", "56", "57",
            "60", "61", "62", "63", "64", "65", "66", "67",
            "70", "71", "72", "73", "74", "75", "76", "77"));

    public static List<String> placedCoordinates(String placementSequence){
        String placementPosition = placementSequence.replaceAll("([a-d][a-d][a-d][a-d])", ",");
        String[] coordinatesArray = placementPosition.split(",");
        List<String> coordinatesList = new ArrayList<>(Arrays.asList(coordinatesArray));
        coordinatesList.remove("");
        return coordinatesList;
    }

    public static List<Integer> coordinatesAsNumbers(String placementSequence) {
        List<String> coordinatesList = placedCoordinates(placementSequence);
        List<Integer> coordinatesNum = new ArrayList<>();
        for (String coordinatesString : coordinatesList){
            coordinatesNum.add(Integer.valueOf(coordinatesString));
        }
        return coordinatesNum;
    }
}