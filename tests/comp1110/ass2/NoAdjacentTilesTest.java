package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class NoAdjacentTilesTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(500);

    private void test(String piecePlacement, Boolean expected) {
        boolean out = Tiles.noAdjacentTiles(piecePlacement);
        assertEquals("expected " + expected + " for piece placement: " + piecePlacement +
                ", but got " + out, out, expected);
    }

    @Test
    public void testNone(){
        String emptyString = "";
        test(emptyString, false);
    }

    @Test
    public void testSingleTile() {
        String singleTile = "aaaa01";
        test(singleTile, false);
    }

    @Test
    public void testMultipleTilesFalse() {
        String multipleTiles = "cccc01cbaa72ccda50adad06bcbc30dbcd16cddb51aaaa02dada31cbcb07";
        test(multipleTiles, false);
    }

    @Test
    public void testMultipleTilesTrue() {
        String multipleTiles = "cccc01cbaa72ccda50adad06bcbc30dbcd16cddb51aaaa02dada31cbcb07aaaa22bbbb23";
        test(multipleTiles, true);
    }
}