package comp1110.ass2;
//test edited by xikang song(u6486892)
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class GetNextExitTest {

    @Rule
    public Timeout globalTimeout = Timeout.millis(500);

    private static final int EXPECTED_INVALID = -1;

    @Test
    public void testIllegalEntry() {
        String tile = Utilities.BOARDSTRINGS_FOR_DECK[0].substring(0, 4);
        int entry = -1;
        int res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid input enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == EXPECTED_INVALID);

        entry = 50;
        res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid input enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == EXPECTED_INVALID);

        entry = -128;
        res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid input enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == EXPECTED_INVALID);
    }

    @Test
    public void testIllegalTile() {
        final List<String> illegal_tile = Arrays.asList("aacbc", "cbaas", "acba213", "ba", "aaa",
                "1234", " ", "!@#", "7777", "13cb666");
        Random rand = new Random();
        for (String tile : illegal_tile) {
            int entry = rand.nextInt(8);
            int res = Tiles.getNextExit(tile, entry);
            assertTrue("For invalid tile at enrty \"" + entry + "\" " +
                    "on tile " + tile + ", got exit " + res, res == EXPECTED_INVALID);
        }

        String tile = null;
        int entry = rand.nextInt(8);
        int res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid tile at enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == EXPECTED_INVALID);
    }

    @Test
    public void tesCommonTrip() {
        String tile = "aaaa";
        int entry = 0;
        int res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid input enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == 5);

        entry = 3;
        res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid input enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == 2);


        tile = "bcbc";
        entry = 1;
        res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid input enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == entry - 1);

        entry = 3;
        res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid input enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == entry - 1);

        entry = 6;
        res = Tiles.getNextExit(tile, entry);
        assertTrue("For invalid input enrty \"" + entry + "\" " +
                "on tile " + tile + ", got exit " + res, res == entry - 1);

    }

}
