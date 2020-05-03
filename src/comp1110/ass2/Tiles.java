package comp1110.ass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tiles {
    public final static List<String> fourTiles = Arrays.asList("aacb", "cbaa", "acba", "baac", "aaaa"); //5
    public final static List<String> threeTiles = Arrays.asList("cbcb", "bcbc"); //2
    public final static List<String> twoTiles = Arrays.asList("cccc", "bbbb", "dacc", "cdac", "ccda",
            "accd", "dbba", "adbb", "badb", "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd"); //17
    public static List<String> placedTiles(String placementSequence) {
        String tilesString = placementSequence.replaceAll("([0-7][0-7])", ",");
        String[] tilesArray = tilesString.split(",");
        return new ArrayList<>(Arrays.asList(tilesArray));
    }
    public static List<String> allTiles(){
        List<String> list00 = new ArrayList<>(List.copyOf(fourTiles));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                list00.add(list00.get(i));
            }
        }
        List<String> list01 = new ArrayList<>(List.copyOf(threeTiles));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                list01.add(list01.get(i));
            }
        }
        List<String> list02 = new ArrayList<>(List.copyOf(twoTiles));
        for (int i = 0; i < 17; i++) {
            list02.add(list02.get(i));
        }
        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(list00);
        joinedList.addAll(list01);
        joinedList.addAll(list02);
        return joinedList;
    }
}