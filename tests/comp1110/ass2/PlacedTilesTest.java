package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlacedTilesTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(500);

    @Test
    public void testNone(){
        String emptyString = "";
        List<String> emptyList = new ArrayList<>();
        assertEquals(emptyList, Tiles.placedTiles(emptyString));
    }

    @Test
    public void testSingleTile(){
        String singleTile = "aaaa01";
        List<String> singleList = new ArrayList<>(Collections.singletonList("aaaa"));
        assertEquals(singleList, Tiles.placedTiles(singleTile));
    }

    @Test
    public void testMultipleTiles(){
        String multipleTiles = "cccc01cbaa72ccda50adad06bcbc30dbcd16cddb51aaaa02dada31cbcb07";
        List<String> multipleList = new ArrayList<>(Arrays.asList("cccc", "cbaa", "ccda", "adad", "bcbc", "dbcd", "cddb", "aaaa", "dada", "cbcb"));
        assertEquals(multipleList, Tiles.placedTiles(multipleTiles));
    }
}