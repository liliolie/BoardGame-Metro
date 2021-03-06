/**
 Class Tiles is authored by Chan Xu, u7076870
 */
package comp1110.ass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tiles {

    public static List<String> placedTiles(String placementSequence) {
        String tilesString = placementSequence.replaceAll("([0-7][0-7])", ",");
        String[] tilesArray = tilesString.split(",");
        List<String> tilesList = new ArrayList<>(Arrays.asList(tilesArray));
        tilesList.remove("");
        return tilesList;
    }

    public static List<String> allTiles(){
        List<String> list00 = new ArrayList<>(List.copyOf(TilesEnum.Four.getTiles()));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                list00.add(list00.get(i));
            }
        }
        List<String> list01 = new ArrayList<>(List.copyOf(TilesEnum.Three.getTiles()));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                list01.add(list01.get(i));
            }
        }
        List<String> list02 = new ArrayList<>(List.copyOf(TilesEnum.Two.getTiles()));
        for (int i = 0; i < 17; i++) {
            list02.add(list02.get(i));
        }
        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(list00);
        joinedList.addAll(list01);
        joinedList.addAll(list02);
        return joinedList;
    }

    public static boolean overlapTiles(String placementSequence){
        List<String> position = Coordinates.placedCoordinates(placementSequence);
        for (int i = 0; i < position.size(); i++) {
            String coordinate1 = position.get(i);
            if (coordinate1.equals("33") || coordinate1.equals("34") || coordinate1.equals("43") || coordinate1.equals("44")) return true;
            for (int j = position.size() - 1; j > i; j--) {
                String coordinate2 = position.get(j);
                if (coordinate1.equals(coordinate2)) return true;
            }
        }
        return false;
    }

    public static boolean noAdjacentTiles(String placementSequence){
        List<Integer> positionNum = Coordinates.coordinatesAsNumbers(placementSequence);
        for (int i = 0; i < positionNum.size(); i++) {
            Integer coordinateNum = positionNum.get(i);
            List<Integer> previousCoordinates = positionNum.subList(0, i);
            if ((coordinateNum >= 11 && coordinateNum <= 16) ||
                    (coordinateNum >= 21 && coordinateNum <= 26) ||
                    (coordinateNum >= 31 && coordinateNum <= 36) ||
                    (coordinateNum >= 41 && coordinateNum <= 46) ||
                    (coordinateNum >= 51 && coordinateNum <= 56) ||
                    (coordinateNum >= 61 && coordinateNum <= 66)) {
                if (!previousCoordinates.contains(coordinateNum + 1) &&
                        !previousCoordinates.contains(coordinateNum - 1) &&
                        !previousCoordinates.contains(coordinateNum + 10) &&
                        !previousCoordinates.contains(coordinateNum - 10)) return true;
            }
        }
        return false;
    }
    // Authored by XiKang Song, u6486892
    public static List<Integer> tilesCount(String placement, List<String> tilesList){
        List<Integer> intList = new ArrayList<>(5);
        int[] num = new int[tilesList.size()];
        for (int i = 0; i < tilesList.size(); i++) {
            Matcher matcher = Pattern.compile(tilesList.get(i)).matcher(placement);
            while (matcher.find()) {
                num[i]++;
            }
            intList.add(num[i]);
        }
        return intList;
    }
    // Authored by XiKang Song, u6486892
    public static int getNextExit(String tile, int entry) {
        if (entry < 0 || entry > 7) return -1;
        if (!TilesEnum.All.getTiles().contains(tile)) return -1;
        if (entry % 2 == 0)
            switch (tile.charAt(entry / 2)) {
                case 'a':
                    return entry < 3 ? entry + 5 : entry - 3;
                case 'b':
                    return entry == 6 ? 1 : entry + 3;
                case 'c':
                    return entry == 0 ? 7 : entry - 1;
                case 'd':
                    return entry + 1;
            }
        for (int t = entry, i = 0; i < 4; i++) {
            switch (tile.charAt(i)) {
                case 'a':
                    t = i < 3 ? i + 5 : i - 3;
                case 'b':
                    t = i == 6 ? 1 : i + 3;
                case 'c':
                    t = i == 0 ? 7 : i - 1;
                case 'd':
                    t = i + 1;
            }
            if (t == entry) return i;
        }
        return -1;
    }
}