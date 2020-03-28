package comp1110.ass2;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Metro {
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
//  Method 1
        if (piecePlacement.length() == 6) {
            for (int i = 0; i < piecePlacement.length() - 2; i++) {
                if (!(piecePlacement.charAt(i) >= 'a' && piecePlacement.charAt(i) <= 'd')) {
                    return false;
                }
            }
            for (int i = 4; i < piecePlacement.length(); i++) {
                if (!(piecePlacement.charAt(i) >= '0' && piecePlacement.charAt(i) <= '7')) {
                    return false;
                }
            }
        } else return false;
        return true;
    }
//  Method 2
//        Pattern pattern = Pattern.compile("[a-d][a-d][a-d][a-d][0-7][0-7]");
//        Matcher matcher = pattern.matcher(piecePlacement);
//        return matcher.matches();

//  Method 3
//        return piecePlacement.matches("[a-d][a-d][a-d][a-d][0-7][0-7]");
//    }
    // FIXME Task 2: determine whether a piece placement is well-formed


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
        //count how many times the substring appears in the larger string


        String[] list0 = {"aacb", "cbaa", "acba", "baac", "aaaa"};
        int[] num = {0, 0, 0, 0, 0};

        for (int i = 0; i < list0.length; i++) {

            Matcher matcher = Pattern.compile(list0[i]).matcher(placement);

            while (matcher.find()) {
                num[i]++;

            }
        }

        String[] list1 = {"cbcb", "bcbc"};
        int[] num1 = {0, 0};

        for (int i = 0; i < list1.length; i++) {

            Matcher matcher = Pattern.compile(list1[i]).matcher(placement);

            while (matcher.find()) {
                num1[i]++;
            }
        }

        String[] list2 = {"cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb", "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd"};
        int[] num2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < list2.length; i++) {

            Matcher matcher = Pattern.compile(list2[i]).matcher(placement);

            while (matcher.find()) {
                num2[i]++;
            }
        }

        List<Integer> intList = new ArrayList<Integer>(num.length);
        for (int i : num) {
            intList.add(i);
        }
        List<Integer> intList1 = new ArrayList<Integer>(num1.length);
        for (int i : num1) {
            intList1.add(i);
        }
        List<Integer> intList2 = new ArrayList<Integer>(num2.length);
        for (int i : num2) {
            intList2.add(i);
        }

        if (placement.length() % 6 == 0) {
            for (int i = 0; i < placement.length(); i += 6) {
                String substring = placement.substring(i, i += 6);
                if (!(isPiecePlacementWellFormed(substring))) {
                    return false;
                }
            }
        } else return false;
        if (Collections.max(intList).compareTo(4) > 0 || Collections.max(intList1).compareTo(3) > 0 || Collections.max(intList2).compareTo(2) > 0) {
            return false;
        }
        return true;
    }

    // FIXME Task 3: determine whether a placement sequence is well-formed

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

        // create total tiles list
        List<String> list0 = Arrays.asList("aacb", "cbaa", "acba", "baac", "aaaa");
        List<String> list1 = Arrays.asList("cbcb", "bcbc");
        List<String> list2 = Arrays.asList("cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb", "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd");

        List<String> repeatList0 = new ArrayList<>();
        List<String> repeatList1 = new ArrayList<>();
        List<String> repeatList2 = new ArrayList<>();

        int indexOfList0 = 0;
        int indexOfList1 = 0;
        int indexOfList2 = 0;

        for (int i = 1; i < list0.size() * 4 + 1; i++) {
            repeatList0.add(list0.get(indexOfList0++));
            if (indexOfList0 == list0.size()) {
                indexOfList0 = 0;
            }
        }

        for (int i = 1; i < list1.size() * 3 + 1; i++) {
            repeatList1.add(list1.get(indexOfList1++));
            if (indexOfList1 == list1.size()) {
                indexOfList1 = 0;
            }
        }

        for (int i = 1; i < list2.size() * 2 + 1; i++) {
            repeatList2.add(list2.get(indexOfList2++));
            if (indexOfList2 == list2.size()) {
                indexOfList2 = 0;
            }
        }

        List<String> joinedList = new ArrayList<>();
        Stream.of(repeatList0, repeatList1, repeatList2).forEach(joinedList::addAll);
        String[] allTiles = joinedList.toArray(new String[0]);

        //remove the tile been placed and get the leftover list
        for (int i = 0; i < allTiles.length; i++) {
            Matcher matcher = Pattern.compile(allTiles[i]).matcher(placementSequence);
            while (matcher.find()) {
                joinedList.remove(allTiles[i]);
                placementSequence = placementSequence.substring(0, placementSequence.indexOf(allTiles[i])) + placementSequence.substring(placementSequence.indexOf(allTiles[i]) + 6);
            }
        }

        //random a tile from the leftover list
        int randIndex = new Random().nextInt(joinedList.size()); //generate random int [0,size]
        String randTile = joinedList.get(randIndex);

        return randTile;
    }

    // FIXME Task 5: draw a random tile from the deck


    // check tails been placed
    // leftover
    // Random a tail form the deck

    /**
     * Task 6
     * Determine if a given placement sequence follows the rules of the game.
     * These rules are:
     * - All tracks on all placed pieces must eventually arrive at a station.
     * - No piece can overlap another piece, or any of the central stations.
     * - If a piece is on an edge of the board, it cannot contain a track that
     * results in a station looping back to itself, UNLESS it is unavoidable.
     * - If a piece is on a corner of the board, it cannot contain a track that
     * links the two stations adjacent to that corner, UNLESS it is
     * unavoidable.
     *
     * @param placementSequence A sequence of placements on the board.
     * @return Whether this placement string is valid.
     */
    public static boolean isPlacementSequenceValid(String placementSequence) {
        // FIXME Task 6: determine whether a placement sequence is valid
        return false;


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
        return new int[0];
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
