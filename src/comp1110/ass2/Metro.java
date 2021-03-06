package comp1110.ass2;

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
        //  Method 1 Authored by Chan Xu, u7076870
        return piecePlacement.matches("[a-d][a-d][a-d][a-d][0-7][0-7]");
    }
    //  Method 2 Authored by Lily Chen, u6004244
//        Pattern pattern = Pattern.compile("[a-d][a-d][a-d][a-d][0-7][0-7]");
//        Matcher matcher = pattern.matcher(piecePlacement);
//        return matcher.matches();
    //  Method 3 Authored by Lily Chen, u6004244
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
        //  Method 1 Authored by Lily Chen, u6004244
        // Count how many times the substring appears in the larger string
        List<Integer> intList0 = Tiles.tilesCount(placement, TilesEnum.Four.getTiles());
        List<Integer> intList1 = Tiles.tilesCount(placement, TilesEnum.Three.getTiles());
        List<Integer> intList2 = Tiles.tilesCount(placement, TilesEnum.Two.getTiles());
        if (placement.length() % 6 == 0) {
            for (int i = 0; i < placement.length() - 6; i += 6) {
                if (!(isPiecePlacementWellFormed(placement.substring(i, i + 6)))) {
                    return false;
                }
            }
        } else return false;
        return Collections.max(intList0).compareTo(4) <= 0 && Collections.max(intList1).compareTo(3) <= 0 && Collections.max(intList2).compareTo(2) <= 0;
    }

    //  Method 2 Authored by Chan Xu, u7076870
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
        //  Method 1 Authored by Chan Xu, u7076870
        List<String> joinedList = new ArrayList<>(Tiles.allTiles());
        if (placementSequence.length() != 0) {
            for (int i = 0; i <= placementSequence.length() - 6; i += 6) {
                joinedList.remove(placementSequence.substring(i, i + 4));
            }
        }
        if (totalHands.length() != 0) {
            for (int i = 0; i <= totalHands.length() - 4; i += 4) {
                joinedList.remove(totalHands.substring(i, i + 4));
            }
        }
        Random rand = new Random();
        int index = rand.nextInt(joinedList.size());
        return joinedList.get(index);
    }
    //  Method 2 Authored by Lily Chen, u6004244
    // Create total tiles list
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

    public static boolean isPlacementSequenceValid(String placementSequence) {
        // FIXME Task 6: determine whether a placement sequence is valid
        //  Authored by Chan Xu, u7076870
        //If the placementSequence is not well formed, return false.
        if (!isPlacementSequenceWellFormed(placementSequence)) return false;
        //A placementSequence is valid if it is empty.
        if (placementSequence.length() == 0) return true;
        //Use the method in the Coordinates class to creat a list of strings with each string as a
        // coordinate of each tile in the placementSequence.
        List<String> position = Coordinates.placedCoordinates(placementSequence);
        //Use the method in the Coordinates class to creat a list of integers with each integer as a
        // coordinate of each tile in the placementSequence.
        List<Integer> positionNum = Coordinates.coordinatesAsNumbers(placementSequence);
        //Use the method in the Tiles class to check if there is a tile that overlap another tile,
        // or any one of the center stations.
        if (Tiles.overlapTiles(placementSequence)) return false;
        //Use the method in the Tiles class to check if a tile is placed to continue or complete an existing track.
        if (Tiles.noAdjacentTiles(placementSequence)) return false;
        //Use the method in the Tiles class to creat a list of strings with each string as a
        // tile in the placementSequence.
        List<String> tile = Tiles.placedTiles(placementSequence);
        for (int i = 0; i < position.size(); i++) {
            char first = tile.get(i).charAt(0);
            char second = tile.get(i).charAt(1);
            char third = tile.get(i).charAt(2);
            char fourth = tile.get(i).charAt(3);
            char row = position.get(i).charAt(0);
            char column = position.get(i).charAt(1);
            String coordinate = position.get(i);
            //Creat a list of integer with each integer as a coordinate of the surrounding of the board.
            List<Integer> initialCoord = new ArrayList<>(CoordinatesEnum.Surround.getCoordinates());
            //For the first tile in the placementSequence, it can be only placed on a coordinate
            // of the surrounding of the board.
            //Otherwise, it can be placed on a coordinate of the surrounding of the board and a coordinate
            // that is enabled by the previous tile(s).
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    initialCoord.addAll(Arrays.asList(positionNum.get(j) + 1, positionNum.get(j) - 1,
                            positionNum.get(j) + 10, positionNum.get(j) - 10));
                    initialCoord.retainAll(CoordinatesEnum.All.getCoordinates());
                }
                for (int j = 0; j < i; j++) {
                    while (initialCoord.contains(positionNum.get(j))) {
                        initialCoord.remove(positionNum.get(j));
                    }
                }
                initialCoord = initialCoord.stream().distinct().collect(Collectors.toList());
            }
            //If the first character of the tile is 'd', it cannot be placed on the top row
            // of the board.
            if (first == 'd') {
                initialCoord.removeAll(CoordinatesEnum.Top.getCoordinates());
            }
            //If the second character of the tile is 'd', it cannot be placed on the right column
            // of the board.
            if (second == 'd') {
                initialCoord.removeAll(CoordinatesEnum.Right.getCoordinates());
            }
            //If the third character of the tile is 'd', it cannot be placed on the bottom row
            // of the board.
            if (third == 'd') {
                initialCoord.removeAll(CoordinatesEnum.Bottom.getCoordinates());
            }
            //If the fourth character of the tile is 'd', it cannot be placed on the left column
            // of the board.
            if (fourth == 'd') {
                initialCoord.removeAll(CoordinatesEnum.Left.getCoordinates());
            }
            //If the first character of the tile is 'b' or the second character of the tile is 'c',
            // it cannot be placed on the top right corner of the board.
            if (first == 'b' || second == 'c') {
                initialCoord.removeAll(Collections.singletonList(7));
            }
            //If the first character of the tile is 'c' or the fourth character of the tile is 'b',
            // it cannot be placed on the top left corner of the board.
            if (first == 'c' || fourth == 'b') {
                initialCoord.removeAll(Collections.singletonList(0));
            }
            //If the third character of the tile is 'b' or the fourth character of the tile is 'c',
            // it cannot be placed on the bottom left corner of the board.
            if (third == 'b' || fourth == 'c') {
                initialCoord.removeAll(Collections.singletonList(70));
            }
            //If the second character of the tile is 'b' or the third character of the tile is 'c',
            // it cannot be placed on the bottom right corner of the board.
            if (second == 'b' || third == 'c') {
                initialCoord.removeAll(Collections.singletonList(77));
            }
            //If a tile in the placementSequence contains 'b', 'c', and 'd', check if there is any
            // coordinates other than the ones of the surrounding of the board available for this tile.
            //Return false if this tile is able to be placed elsewhere but is placed on a place it
            // should not be placed.
            if ((first == 'd' && row == '0') ||
                    (second == 'd' && column == '7') ||
                    (third == 'd' && row == '7') ||
                    (fourth == 'd' && column == '0') ||
                    (first == 'b' && coordinate.equals("07")) || (second == 'c' && coordinate.equals("07")) ||
                    (fourth == 'b' && coordinate.equals("00")) || (first == 'c' && coordinate.equals("00")) ||
                    (third == 'b' && coordinate.equals("70")) || (fourth == 'c' && coordinate.equals("70")) ||
                    (second == 'b' && coordinate.equals("77")) || (third == 'c' && coordinate.equals("77"))) {
                if (initialCoord.size() > 0) return false;
            }
        }
        return true;
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
        //  Authored by Xikang Song, u6486892; Chan Xu, u7076870
        int[] s = singleTrackScore(placementSequence);
        //if (placementSequence.equals(SAMPLE_START)) res[1]--;
        return sumTrackScore(s, numberOfPlayers);
    }

    protected static int[] sumTrackScore(int[] station, int numberOfPlayers) {
        int[] allScores = new int[numberOfPlayers];
        if (numberOfPlayers == 2)
            for (int i = 0; i < 32; i++)
                allScores[i % 2] += station[i];
        else if (numberOfPlayers == 3) {// 3  10  4  3  1  6  6  31  2  4
            allScores[0] = station[0] + station[3] + station[5] + station[10] + station[14] + station[19] + station[22] + station[24] + station[27] + station[30];
            allScores[1] = station[1] + station[6] + station[8] + station[11] + station[13] + station[18] + station[21] + station[26] + station[28] + station[31];
            allScores[2] = station[2] + station[4] + station[7] + station[9] + station[12] + station[17] + station[20] + station[23] + station[25] + station[29];
        } else if (numberOfPlayers == 4) {
            allScores[0] = station[3] + station[6] + station[10] + station[15] + station[19] + station[22] + station[26] + station[31];
            allScores[1] = station[2] + station[7] + station[11] + station[14] + station[18] + station[23] + station[27] + station[30];
            allScores[2] = station[0] + station[5] + station[9] + station[12] + station[17] + station[20] + station[24] + station[29];
            allScores[3] = station[1] + station[4] + station[8] + station[13] + station[16] + station[21] + station[25] + station[28];
        } else if (numberOfPlayers == 5) {
            allScores[0] = station[0] + station[4] + station[9] + station[13] + station[21] + station[27];
            allScores[1] = station[5] + station[11] + station[17] + station[22] + station[26] + station[31];
            allScores[2] = station[2] + station[6] + station[14] + station[18] + station[24] + station[28];
            allScores[3] = station[1] + station[8] + station[12] + station[20] + station[25] + station[29];
            allScores[4] = station[3] + station[7] + station[10] + station[19] + station[23] + station[30];
        } else {
            allScores[0] = station[0] + station[4] + station[9] + station[18] + station[26];
            allScores[1] = station[1] + station[10] + station[17] + station[24] + station[28];
            allScores[2] = station[3] + station[7] + station[13] + station[20] + station[25];
            allScores[3] = station[5] + station[14] + station[19] + station[23] + station[30];
            allScores[4] = station[2] + station[8] + station[12] + station[22] + station[29];
            allScores[5] = station[6] + station[11] + station[21] + station[27] + station[31];
        }
        //if (placementSequence.equals(SAMPLE_START)) res[1]--;
        return allScores;
    }

    protected static int[] singleTrackScore(String placementSequence) {
        //Calculate the scores of every complete track that starts from each station and store them into an array
        int[] station = new int[32];
        String str;
        for (int l = placementSequence.length(), next, row, col, j, i = 0; i < 32; i++) {
            int t = 0;
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
                //get the way to next tile by entry number and tile type
                next = Tiles.getNextExit(str, next);
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
                station[i] = (3 <= row && row <= 4 && 3 <= col && col <= 4) ? 2 * t : t;
        }
        return station;
    }

    /**
     * Task 9
     * Given a placement sequence string, generate a valid next move.
     *
     * @param placementSequence a String representing the sequence of piece placements made so far in the game
     * @param piece             a four-character String representing the tile to be placed
     * @param numberOfPlayers   The number of players in the game
     * @return A valid placement of the given tile
     */
    public static String generateMove(String placementSequence, String piece, int numberOfPlayers) {
        // FIXME Task 9: generate a valid move
        //  Authored by Xikang Song, u6486892
        String res = "";
        A:
        for (int j, i = 0; i < 8; i++)
            for (j = 0; j < 8; j++)
                if (isPlacementSequenceValid(placementSequence + piece + i + j)) {
                    res = piece + i + j;
                    break A;
                }
        return res;
    }
}