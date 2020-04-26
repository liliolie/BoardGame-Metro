package comp1110.ass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Coordinates {
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
