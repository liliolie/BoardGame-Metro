/**
Class Coordinates is authored by Chan Xu, u7076870
 */
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