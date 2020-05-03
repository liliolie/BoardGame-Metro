package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlacedCoordinatesTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(500);

    @Test
    public void testNone(){
        String emptyString = "";
        List<String> emptyList = new ArrayList<>();
        assertEquals(emptyList, Coordinates.placedCoordinates(emptyString));
    }

    @Test
    public void testSingleTile(){
        String singleTile = "aaaa01";
        List<String> singleList = new ArrayList<>(Collections.singletonList("01"));
        assertEquals(singleList, Coordinates.placedCoordinates(singleTile));
    }

    @Test
    public void testMultipleTiles(){
        String multipleTiles = "cccc01cbaa72ccda50adad06bcbc30dbcd16cddb51aaaa02dada31cbcb07";
        List<String> multipleList = new ArrayList<>(Arrays.asList("01", "72", "50", "06", "30", "16", "51", "02", "31", "07"));
        assertEquals(multipleList, Coordinates.placedCoordinates(multipleTiles));
    }
}