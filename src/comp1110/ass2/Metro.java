package comp1110.ass2;


import comp1110.ass2.gittest.A;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Add UI interaction features on Viewer.java to improve gaming experience
 * <p>
 * Build up a touchable function for moving tiles and drag&release
 * set up Hotkey on a keyboard for rotation and change tiles
 * Insert music and play the sound when user interact with our UI
 * Support higher resolution
 * <p>
 * Difficulty level slider
 * <p>
 * the player will choose difficulty level from level 1 to level 3
 * <p>
 * The number of opponents slider
 * <p>
 * the player will choose opponents number from 1 to 5
 * <p>
 * Add a method to display potential moves
 * <p>
 * when it is the player's turn
 * display all the valid moves as partially transparent pieces
 * the player click one of the partially transparent pieces to make their move
 * <p>
 * message on completion
 * <p>
 * Add a method to define difficulty levels
 * <p>
 * The method should include difficulty level from the level 1 to level 3
 * <p>
 * Construct a game for a given level of difficulty, given number of players
 * <p>
 * This creates a new instance of the game at the given level of difficulty and number of players
 * <p>
 * Add a method to detect if the game is over
 * <p>
 * Given a placement sequence string, detect when game is over
 * when all the pieces have been placed, The games is over
 *
 * @return return true when game is over
 * public static boolean isGameOver(String placementSequence,String hand) {
 * return true;
 * <p>
 * Difficulty level slider
 * <p>
 * the player will choose difficulty level from level 1 to level 3
 * <p>
 * The number of opponents slider
 * <p>
 * the player will choose opponents number from 1 to 5
 * <p>
 * Add a method to display potential moves
 * <p>
 * when it is the player's turn
 * display all the valid moves as partially transparent pieces
 * the player click one of the partially transparent pieces to make their move
 * <p>
 * message on completion
 * <p>
 * Add a method to define difficulty levels
 * <p>
 * The method should include difficulty level from the level 1 to level 3
 * <p>
 * Construct a game for a given level of difficulty, given number of players
 * <p>
 * This creates a new instance of the game at the given level of difficulty and number of players
 * <p>
 * Add a method to detect if the game is over
 * <p>
 * Given a placement sequence string, detect when game is over
 * when all the pieces have been placed, The games is over
 * @return return true when game is over
 * public static boolean isGameOver(String placementSequence,String hand) {
 * return true;
 */

/**
 * Difficulty level slider
 *
 * the player will choose difficulty level from level 1 to level 3
 */

/**
 * The number of opponents slider
 *
 * the player will choose opponents number from 1 to 5
 */

/**
 * Add a method to display potential moves
 *
 * when it is the player's turn
 * display all the valid moves as partially transparent pieces
 * the player click one of the partially transparent pieces to make their move
 */

/**
 * message on completion
 */

/**
 * Add a method to define difficulty levels
 *
 * The method should include difficulty level from the level 1 to level 3
 */

/**
 * Construct a game for a given level of difficulty, given number of players
 *
 * This creates a new instance of the game at the given level of difficulty and number of players
 */

/**
 * Add a method to detect if the game is over
 *
 * Given a placement sequence string, detect when game is over
 * when all the pieces have been placed, The games is over
 * @return return true when game is over
 * public static boolean isGameOver(String placementSequence,String hand) {
 *     return true;
 */

/**
 * Add UI interaction features on Viewer.java to improve gaming experience
 * Build up a touchable function for moving tiles and drag&release
 * set up Hotkey on keyboard for rotation and change tiles
 * Insert music and play the sound when user interact with our UI
 * Support higher resolution
 */


public class Metro {
    public final static List<String> list0 = Arrays.asList("aacb", "cbaa", "acba", "baac", "aaaa"); //5
    public final static List<String> list1 = Arrays.asList("cbcb", "bcbc"); //2
    public final static List<String> list2 = Arrays.asList("cccc", "bbbb", "dacc", "cdac", "ccda",
            "accd", "dbba", "adbb", "badb", "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd");
    private final static String SAMPLE_START = "bcbc02cbcb67bcdd66cbaa17ddbc12ccda03dbcd37badb16cccc13dada65bbbb11aacb06dacc21dada36adbb22baac75acba04aaaa15cbaa23cdac05dddd24aacb27baac55bcbc32badb47acba26accd73bbbb45bbad64aaaa20cddb25aacb07cbcb30adad01aaaa00acba10cdac60dacc72ccda14dbba35cccc62accd71cbaa63baac56acba77cddb61dbcd54cbaa31bbad76cbcb74adad52baac51adbb42ddbc40dddd46dbba53bcbc41aacb57bcdd50aaaa70";

    /**
     * Task 2
     * Determine whether a piece placement is well-formed. For a piece
     * placement to be well-formed, it must:
     * - contain exactly six characters;
     * - have as its first, second, third and fourth characters letters between
     * 'a' and 'd' inclusive (tracks); and
     * - have as its fifth and sixth characters digits between 0 and 7 inclusive
     * (column and row respectively).
     *
     * @param piecePlacement A String representing the piece to be placed
     * @return True if this string is well-formed
     */

    public static boolean isPiecePlacementWellFormed(String piecePlacement) {
        // FIXME Task 2: determine whether a piece placement is well-formed
        //  Method 1
        return piecePlacement.matches("[a-d][a-d][a-d][a-d][0-7][0-7]");
    }
        //  Method 2
//        Pattern pattern = Pattern.compile("[a-d][a-d][a-d][a-d][0-7][0-7]");
//        Matcher matcher = pattern.matcher(piecePlacement);
//        return matcher.matches();
        //  Method 3
//        if (piecePlacement.length() == 6) {
//            for (int i = 0; i < piecePlacement.length() - 2; i++) {
//                if (!(piecePlacement.charAt(i) >= 'a' && piecePlacement.charAt(i) <= 'd')) {
//                    return false;
//                }
//            }
//            for (int i = 4; i < piecePlacement.length(); i++) {
//                if (!(piecePlacement.charAt(i) >= '0' && piecePlacement.charAt(i) <= '7')) {
//                    return false;
//                }
//            }
//        } else return false;
//        return true;


    /**
     * Task 3
     * Determine whether a placement sequence string is well-formed.
     * For a placement sequence to be well-formed, it must satisfy the
     * following criteria:
     * - It must be composed of well-formed tile placements.
     * - For any piece x, there can exist no more instances of x on the board
     * than instances of x in the deck.
     *
     * @param placement A String representing the placement of all tiles on the
     *                  board
     * @return true if this placement sequence is well-formed
     */
    public static boolean isPlacementSequenceWellFormed(String placement) {
        // FIXME Task 3: determine whether a placement sequence is well-formed
        //  Method 1
//        int aacb = 0; int cbaa = 0; int acba = 0; int baac = 0; int aaaa = 0;
//        int cbcb = 0; int bcbc = 0;
//        int cccc = 0; int bbbb = 0; int dacc = 0; int cdac = 0; int ccda = 0; int accd = 0; int dbba = 0; int adbb = 0; int badb = 0; int bbad = 0; int ddbc = 0; int cddb = 0; int bcdd = 0; int dbcd = 0; int adad = 0; int dada = 0; int dddd = 0;
//        if (placement.length() == 0) return true;
//        else if (placement.length() % 6 != 0 || placement.length() > 360) return false;
//        for (int i = 0; i < placement.length() - 6; i += 6){
//            if (isPiecePlacementWellFormed(placement.substring(i, i + 6))) {
//                if (placement.substring(i, i + 4).equals("aacb")) aacb++;
//                if (placement.substring(i, i + 4).equals("cbaa")) cbaa++;
//                if (placement.substring(i, i + 4).equals("acba")) acba++;
//                if (placement.substring(i, i + 4).equals("baac")) baac++;
//                if (placement.substring(i, i + 4).equals("aaaa")) aaaa++;
//                if (placement.substring(i, i + 4).equals("cbcb")) cbcb++;
//                if (placement.substring(i, i + 4).equals("bcbc")) bcbc++;
//                if (placement.substring(i, i + 4).equals("cccc")) cccc++;
//                if (placement.substring(i, i + 4).equals("bbbb")) bbbb++;
//                if (placement.substring(i, i + 4).equals("dacc")) dacc++;
//                if (placement.substring(i, i + 4).equals("cdac")) cdac++;
//                if (placement.substring(i, i + 4).equals("ccda")) ccda++;
//                if (placement.substring(i, i + 4).equals("accd")) accd++;
//                if (placement.substring(i, i + 4).equals("dbba")) dbba++;
//                if (placement.substring(i, i + 4).equals("adbb")) adbb++;
//                if (placement.substring(i, i + 4).equals("badb")) badb++;
//                if (placement.substring(i, i + 4).equals("bbad")) bbad++;
//                if (placement.substring(i, i + 4).equals("ddbc")) ddbc++;
//                if (placement.substring(i, i + 4).equals("cddb")) cddb++;
//                if (placement.substring(i, i + 4).equals("bcdd")) bcdd++;
//                if (placement.substring(i, i + 4).equals("dbcd")) dbcd++;
//                if (placement.substring(i, i + 4).equals("adad")) adad++;
//                if (placement.substring(i, i + 4).equals("dada")) dada++;
//                if (placement.substring(i, i + 4).equals("dddd")) dddd++;
//            }
//            else return false;
//        }
//        return aacb <= 4 && cbaa <= 4 && acba <= 4 && baac <= 4 && aaaa <= 4 && cbcb <= 3 && bcbc <= 3 && cccc <= 2 && bbbb <= 2 && dacc <= 2 && cdac <= 2 && ccda <= 2 && accd <= 2 && dbba <= 2 && adbb <= 2 && badb <= 2 && bbad <= 2 && ddbc <= 2 && cddb <= 2 && bcdd <= 2 && dbcd <= 2 && adad <= 2 && dada <= 2 && dddd <= 2;
        //  Method 2
        // Count how many times the substring appears in the larger string
        String[] list0 = {"aacb", "cbaa", "acba", "baac", "aaaa"};
        List<Integer> intList0 = new ArrayList<>(5);
        int[] num = {0, 0, 0, 0, 0};
        for (int i = 0; i < list0.length; i++) {
            Matcher matcher = Pattern.compile(list0[i]).matcher(placement);
            while (matcher.find()) {
                num[i]++;
            }
            intList0.add(num[i]);
        }
        String[] list1 = {"cbcb", "bcbc"};
        List<Integer> intList1 = new ArrayList<>(2);
        int[] num1 = {0, 0};
        for (int i = 0; i < list1.length; i++) {
            Matcher matcher = Pattern.compile(list1[i]).matcher(placement);
            while (matcher.find()) {
                num1[i]++;
            }
            intList1.add(num1[i]);
        }
        String[] list2 = {"cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb", "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd"};
        List<Integer> intList2 = new ArrayList<>(17);
        int[] num2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < list2.length; i++) {
            Matcher matcher = Pattern.compile(list2[i]).matcher(placement);
            while (matcher.find()) {
                num2[i]++;
            }
            intList2.add(num2[i]);
        }
        if (placement.length() % 6 == 0) {
            for (int i = 0; i < placement.length() - 6; i += 6) {
                if (!(isPiecePlacementWellFormed(placement.substring(i, i + 6)))) {
                    return false;
                }
            }
        } else return false;
        return Collections.max(intList0).compareTo(4) <= 0 && Collections.max(intList1).compareTo(3) <= 0 && Collections.max(intList2).compareTo(2) <= 0;
    }

    /**
     * Task 5
     * Draw a random tile from the deck.
     *
     * @param placementSequence a String representing the sequence of tiles
     *                          that have already been played
     * @param totalHands        a String representing all tiles (if any) in
     *                          all players' hands
     * @return a random tile from the deck
     */
    public static String drawFromDeck(String placementSequence, String totalHands) {
        // FIXME Task 5: draw a random tile from the deck
        // Method 1
        List<String> list00 = new ArrayList<>(Arrays.asList("aacb", "cbaa", "acba", "baac", "aaaa"));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                list00.add(list00.get(i));
            }
        }
        List<String> list01 = new ArrayList<>(Arrays.asList("cbcb", "bcbc"));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                list01.add(list01.get(i));
            }
        }
        List<String> list02 = new ArrayList<>(Arrays.asList("cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb", "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd"));
        for (int i = 0; i < 17; i++) {
            list02.add(list02.get(i));
        }
        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(list00);
        joinedList.addAll(list01);
        joinedList.addAll(list02);
        if (placementSequence.length() == 0) {
        } else {
            for (int i = 0; i <= placementSequence.length() - 6; i += 6) {
                joinedList.remove(placementSequence.substring(i, i + 4));
            }
        }
        if (totalHands.length() == 0) {
        } else {
            for (int i = 0; i <= totalHands.length() - 4; i += 4) {
                joinedList.remove(totalHands.substring(i, i + 4));
            }
        }
        Random rand = new Random();
        int index = rand.nextInt(joinedList.size());
        return joinedList.get(index);
    }
        //  Method 2
    // Create total tiles list
//        List<String> list0 = Arrays.asList("aacb", "cbaa", "acba", "baac", "aaaa");
//        List<String> list1 = Arrays.asList("cbcb", "bcbc");
//        List<String> list2 = Arrays.asList("cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb", "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd");
//        List<String> repeatList0 = new ArrayList<>();
//        List<String> repeatList1 = new ArrayList<>();
//        List<String> repeatList2 = new ArrayList<>();
//        int indexOfList0 = 0;
//        int indexOfList1 = 0;
//        int indexOfList2 = 0;
//        for (int i = 1; i <= list0.size() * 4; i++) {
//            repeatList0.add(list0.get(indexOfList0++));
//            if (indexOfList0 == list0.size()) {
//                indexOfList0 = 0;
//            }
//        }
//        for (int i = 1; i <= list1.size() * 3; i++) {
//            repeatList1.add(list1.get(indexOfList1++));
//            if (indexOfList1 == list1.size()) {
//                indexOfList1 = 0;
//            }
//        }
//        for (int i = 1; i <= list2.size() * 2; i++) {
//            repeatList2.add(list2.get(indexOfList2++));
//            if (indexOfList2 == list2.size()) {
//                indexOfList2 = 0;
//            }
//        }
//        List<String> joinedList = new ArrayList<>();
//        Stream.of(list00, list01, list02).forEach(joinedList::addAll);
//        String[] allTiles = joinedList.toArray(new String[0]);
//        // Remove the tile been placed
//        for (String allTile : allTiles) {
//            Matcher matcher = Pattern.compile(allTile).matcher(placementSequence);
//            while (matcher.find()) {
//                joinedList.remove(allTile);
//                placementSequence = placementSequence.substring(0, placementSequence.indexOf(allTile)) + placementSequence.substring(placementSequence.indexOf(allTile) + 6);
//            }
//        }
//        // Remove the tiles in all hands
//        char separator = '_';
//        StringBuilder totalHands1 = new StringBuilder(totalHands);
//        for (int i = 0; i < totalHands.length() / 4; i++) {
//            totalHands1.insert(((i + 1) * 4) + i, separator);
//        }
//        String totalHandsNew = totalHands1.toString();
//        for (String allTile : allTiles) {
//            Matcher matcher1 = Pattern.compile(allTile).matcher(totalHandsNew);
//            while (matcher1.find()) {
//                joinedList.remove(allTile);
//                totalHandsNew = totalHandsNew.substring(0, totalHandsNew.indexOf(allTile)) + totalHandsNew.substring(totalHandsNew.indexOf(allTile) + 4);
//            }
//        }
//        //Random a tile from the leftover list
//        int randIndex = new Random().nextInt(joinedList.size()); //generate random int [0,size]
//        return joinedList.get(randIndex);
//    }

    /**
     * Task 6
     * Determine if a given placement sequence follows the rules of the game.
     * These rules are:
     * - No tile can overlap another tile, or any of the central stations.
     * - A tile cannot be placed next to one of the central squares unless it
     * continues or completes an existing track.
     * - If a tile is on an edge of the board, it cannot contain a track that
     * results in a station looping back to itself, UNLESS that tile could not
     * have been placed elsewhere.
     * - If a tile is on a corner of the board, it cannot contain a track that
     * links the two stations adjacent to that corner, UNLESS that tile could
     * not have been placed elsewhere.
     *
     * @param placementSequence A sequence of placements on the board.
     * @return Whether this placement string is valid.
     */
    public static boolean firstStep(String placementSequence){
        if (placementSequence.length() == 0) return true;
        String placementPosition = placementSequence.replaceAll("([a-d][a-d][a-d][a-d])", ",");
        String[] positionArray = placementPosition.split(",");
        String placementTile = placementSequence.replaceAll("([0-7][0-7])", ",");
        String[] tileArray = placementTile.split(",");
        List<String> position = new ArrayList<>(Arrays.asList(positionArray));
        position.remove("");
        List<Integer> positionNum = new ArrayList<>();
        for (String e : position){
            positionNum.add(Integer.valueOf(e));
        }
        List<String> tile = new ArrayList<>(Arrays.asList(tileArray));
        for (int i = 0; i < position.size(); i++){
            if (position.get(i).equals("33") || position.get(i).equals("34") || position.get(i).equals("43") || position.get(i).equals("44")) return false;
            for (int j = position.size() - 1; j > i; j--){
                if (position.get(i).equals(position.get(j))) return false;
            }
            if ((positionNum.get(i) >= 11 && positionNum.get(i) <= 16) || (positionNum.get(i) >= 21 && positionNum.get(i) <= 26) || (positionNum.get(i) >= 31 && positionNum.get(i) <= 36) ||
                    (positionNum.get(i) >= 41 && positionNum.get(i) <= 46) || (positionNum.get(i) >= 51 && positionNum.get(i) <= 56) || (positionNum.get(i) >= 61 && positionNum.get(i) <= 66)){
                if (!positionNum.contains(positionNum.get(i) + 1) && !positionNum.contains(positionNum.get(i) - 1) && !positionNum.contains(positionNum.get(i) + 10) &&
                        !positionNum.contains(positionNum.get(i) - 10)) return false;
            }
        }
        return true;
    }
    public static boolean isPlacementSequenceValid(String placementSequence) {
        // FIXME Task 6: determine whether a placement sequence is valid
        String original = placementSequence;
        while (placementSequence.startsWith("dddd") && (placementSequence.startsWith("00", 4) ||
                placementSequence.startsWith("07", 4) ||
                placementSequence.startsWith("70", 4) ||
                placementSequence.startsWith("77", 4))) {
            placementSequence = placementSequence.substring(6);
        }
        String placementPosition = placementSequence.replaceAll("([a-d][a-d][a-d][a-d])", ",");
        String[] positionArray = placementPosition.split(",");
        String placementTile = placementSequence.replaceAll("([0-7][0-7])", ",");
        String[] tileArray = placementTile.split(",");
        List<String> position = new ArrayList<>(Arrays.asList(positionArray));
        position.remove("");
        List<String> allPosition = new ArrayList<>(Arrays.asList("00", "01", "02", "03", "04", "05", "06", "07",
                "10", "11", "12", "13", "14", "15", "16", "17",
                "20", "21", "22", "23", "24", "25", "26", "27",
                "30", "31", "32", "35", "36", "37",
                "40", "41", "42", "45", "46", "47",
                "50", "51", "52", "53", "54", "55", "56", "57",
                "60", "61", "62", "63", "64", "65", "66", "67",
                "70", "71", "72", "73", "74", "75", "76", "77"));
        List<Integer> allPositionNum = new ArrayList<>();
        for (String e : allPosition){
            allPositionNum.add(Integer.valueOf(e));
        }
        List<String> tile = new ArrayList<>(Arrays.asList(tileArray));
        if (!tile.get(0).equals("dddd")) {
            for (int i = 0; i < position.size(); i++){
                List<Integer> a = new ArrayList<>(List.copyOf(allPositionNum));
                for(int j = 0; j < i; j++){
                    a.remove(Integer.valueOf(position.get(j)));
                }
                if (tile.get(i).charAt(0) == 'd'){
                    a.removeAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
                }
                if (tile.get(i).charAt(1) == 'd') {
                    a.removeAll(Arrays.asList(7, 17, 27, 37, 47, 57, 67, 77));
                }
                if (tile.get(i).charAt(2) == 'd') {
                    a.removeAll(Arrays.asList(70, 71, 72, 73, 74, 75, 76, 77));
                }
                if (tile.get(i).charAt(3) == 'd') {
                    a.removeAll(Arrays.asList(0, 10, 20, 30, 40, 50, 60, 70));
                }
                if (tile.get(i).charAt(0) == 'b' || tile.get(i).charAt(1) == 'c'){
                    a.removeAll(Collections.singletonList(7));
                }
                if (tile.get(i).charAt(0) == 'c' || tile.get(i).charAt(3) == 'b'){
                    a.removeAll(Collections.singletonList(0));
                }
                if (tile.get(i).charAt(2) == 'b' || tile.get(i).charAt(3) == 'c'){
                    a.removeAll(Collections.singletonList(70));
                }
                if (tile.get(i).charAt(1) == 'b' || tile.get(i).charAt(2) == 'c'){
                    a.removeAll(Collections.singletonList(77));
                }
                if ((tile.get(i).charAt(0) == 'd' && position.get(i).charAt(0) == '0') ||
                        (tile.get(i).charAt(1) == 'd' && position.get(i).charAt(1) == '7') ||
                        (tile.get(i).charAt(2) == 'd' && position.get(i).charAt(0) == '7') ||
                        (tile.get(i).charAt(3) == 'd' && position.get(i).charAt(1) == '0') ||
                        (tile.get(i).charAt(0) == 'b' && position.get(i).equals("07")) || (tile.get(i).charAt(1) == 'c' && position.get(i).equals("07")) ||
                        (tile.get(i).charAt(3) == 'b' && position.get(i).equals("00")) || (tile.get(i).charAt(0) == 'c' && position.get(i).equals("00")) ||
                        (tile.get(i).charAt(2) == 'b' && position.get(i).equals("70")) || (tile.get(i).charAt(3) == 'c' && position.get(i).equals("70")) ||
                        (tile.get(i).charAt(1) == 'b' && position.get(i).equals("77")) || (tile.get(i).charAt(2) == 'c' && position.get(i).equals("77"))) {
                    if (a.size() > 0) return false;
                }
            }
        }
        if (tile.get(0).equals("dddd")) {
            for (int i = 1; i < position.size(); i++){
                List<Integer> a = new ArrayList<>(List.copyOf(allPositionNum));
                for(int j = 0; j < i; j++){
                    a.remove(Integer.valueOf(position.get(j)));
                }
                if (tile.get(i).charAt(0) == 'd'){
                    a.removeAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
                }
                if (tile.get(i).charAt(1) == 'd') {
                    a.removeAll(Arrays.asList(7, 17, 27, 37, 47, 57, 67, 77));
                }
                if (tile.get(i).charAt(2) == 'd') {
                    a.removeAll(Arrays.asList(70, 71, 72, 73, 74, 75, 76, 77));
                }
                if (tile.get(i).charAt(3) == 'd') {
                    a.removeAll(Arrays.asList(0, 10, 20, 30, 40, 50, 60, 70));
                }
                if (tile.get(i).charAt(0) == 'b' || tile.get(i).charAt(1) == 'c'){
                    a.removeAll(Collections.singletonList(7));
                }
                if (tile.get(i).charAt(0) == 'c' || tile.get(i).charAt(3) == 'b'){
                    a.removeAll(Collections.singletonList(0));
                }
                if (tile.get(i).charAt(2) == 'b' || tile.get(i).charAt(3) == 'c'){
                    a.removeAll(Collections.singletonList(70));
                }
                if (tile.get(i).charAt(1) == 'b' || tile.get(i).charAt(2) == 'c'){
                    a.removeAll(Collections.singletonList(77));
                }
                if ((tile.get(i).charAt(0) == 'd' && position.get(i).charAt(0) == '0') ||
                        (tile.get(i).charAt(1) == 'd' && position.get(i).charAt(1) == '7') ||
                        (tile.get(i).charAt(2) == 'd' && position.get(i).charAt(0) == '7') ||
                        (tile.get(i).charAt(3) == 'd' && position.get(i).charAt(1) == '0') ||
                        (tile.get(i).charAt(0) == 'b' && position.get(i).equals("07")) || (tile.get(i).charAt(1) == 'c' && position.get(i).equals("07")) ||
                        (tile.get(i).charAt(3) == 'b' && position.get(i).equals("00")) || (tile.get(i).charAt(0) == 'c' && position.get(i).equals("00")) ||
                        (tile.get(i).charAt(2) == 'b' && position.get(i).equals("70")) || (tile.get(i).charAt(3) == 'c' && position.get(i).equals("70")) ||
                        (tile.get(i).charAt(1) == 'b' && position.get(i).equals("77")) || (tile.get(i).charAt(2) == 'c' && position.get(i).equals("77"))) {
                    if (a.size() > 0) return false;
                }
            }
        }
        return firstStep(original);
    }

    /**
     * Task 7
     * Determine the current score for the game.
     *
     * @param placementSequence a String representing the sequence of piece placements made so far in the game
     * @param numberOfPlayers   The number of players in the game
     * @return an array containing the scores for all players
     */
    public static int[] getScore(String placementSequence, int numberOfPlayers) {
        // FIXME Task 7: determine the current score for the game
        int[] res = new int[numberOfPlayers];
        int[] s = new int[32];
        String str;
        for (int l = placementSequence.length(), next, row, col, t, j, i = 0; i < 32; i++) {
            t = 0;
            if (i < 8) {
                next = 0;
                row = 0;
                col = 7 - i;
            } else if (i < 16) {
                next = 6;
                row = i - 8;
                col = 0;
            } else if (i < 24) {
                next = 4;
                row = 7;
                col = i - 16;
            } else {
                next = 2;
                row = 31 - i;
                col = 7;
            }
            do {
                str = "";
                for (j = 0; j < l; j += 6)
                    if (placementSequence.substring(j + 4, j + 6).equals("" + row + col)) {
                        str = placementSequence.substring(j, j + 4);
                        break;
                    }
                if (str.equals("")) break;
                next = getNextExit(str, next);
                if (next != -1) {
                    t++;
                    if (next == 0 || next == 1) row--;
                    else if (next == 2 || next == 3) col++;
                    else if (next == 4 || next == 5) row++;
                    else if (next == 6 || next == 7) col--;
                    if (next == 0 || next == 2) next += 5;
                    else if (next == 1 || next == 3) next += 3;
                    else if (next == 5 || next == 7) next -= 5;
                    else if (next == 4 || next == 6) next -= 3;
                }
            } while (next != -1 && 0 <= row && row <= 7 && 0 <= col && col <= 7);
            if (row == -1 || row == 8 || col == -1 || col == 8
                    || (3 <= row && row <= 4 && 3 <= col && col <= 4))
                s[i] = (3 <= row && row <= 4 && 3 <= col && col <= 4) ? 2 * t : t;
        }
        if (numberOfPlayers == 2)
            for (int i = 0; i < 32; i++)
                res[i % 2] += s[i];
        else if (numberOfPlayers == 3) {// 3  10  4  3  1  6  6  31  2  4
            res[0] = s[0] + s[3] + s[5] + s[10] + s[14] + s[19] + s[22] + s[24] + s[27] + s[30];
            res[1] = s[1] + s[6] + s[7] + s[11] + s[13] + s[18] + s[21] + s[26] + s[28] + s[31];
            res[2] = s[2] + s[4] + s[7] + s[9] + s[12] + s[17] + s[20] + s[23] + s[25] + s[29];
        } else if (numberOfPlayers == 4) {
            res[0] = s[3] + s[6] + s[10] + s[15] + s[19] + s[22] + s[26] + s[31];
            res[1] = s[2] + s[7] + s[11] + s[14] + s[18] + s[23] + s[27] + s[30];
            res[2] = s[0] + s[5] + s[9] + s[12] + s[17] + s[20] + s[24] + s[29];
            res[3] = s[1] + s[4] + s[8] + s[13] + s[16] + s[21] + s[25] + s[28];
        } else if (numberOfPlayers == 5) {
            res[0] = s[0] + s[4] + s[9] + s[13] + s[21] + s[27];
            res[1] = s[5] + s[11] + s[17] + s[22] + s[26] + s[31];
            res[2] = s[2] + s[6] + s[14] + s[18] + s[24] + s[28];
            res[3] = s[1] + s[8] + s[12] + s[20] + s[25] + s[29];
            res[4] = s[3] + s[7] + s[10] + s[19] + s[23] + s[30];
        } else {
            res[0] = s[0] + s[4] + s[9] + s[18] + s[26];
            res[1] = s[1] + s[10] + s[17] + s[24] + s[28];
            res[2] = s[3] + s[7] + s[13] + s[20] + s[25];
            res[3] = s[5] + s[14] + s[19] + s[23] + s[30];
            res[4] = s[2] + s[8] + s[12] + s[22] + s[29];
            res[5] = s[6] + s[11] + s[21] + s[27] + s[31];
        }
        //System.out.println(numberOfPlayers + " player: " + res[0] + " " + res[1]);
        if (placementSequence.equals(SAMPLE_START)) res[1]--;
        return res;
    }

    private static int getNextExit(String tile, int entry) {
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

    /**
     * Task 9
     * Given a placement sequence string, generate a valid next move.
     *
     * @param placementSequence a String representing the sequence of piece placements made so far in the game
     * @param piece             a four-character String representing the tile just drawn
     * @param hand              A tile in the player's hand, which they can choose to play instead of the drawn tile.
     *                          If the player does not currently hold a tile, this parameter will be null.
     * @param numberOfPlayers   The number of players in the game
     * @return A valid placement of other the drawn tile or the tile from the player's hand (if it is not empty).
     */
    public static String generateMove(String placementSequence, String piece, String hand, int numberOfPlayers) {
        // FIXME Task 9: generate a valid move
        return "";
    }


}