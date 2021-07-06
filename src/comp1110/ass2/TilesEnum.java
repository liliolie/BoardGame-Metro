/**
 Enum TilesEnum is authored by Chan Xu, u7076870
 */
package comp1110.ass2;

import java.util.Arrays;
import java.util.List;

public enum TilesEnum {
    Four("Tiles with 4 copies", Arrays.asList("aacb", "cbaa", "acba", "baac", "aaaa")),
    Three("Tiles with 3 copies", Arrays.asList("cbcb", "bcbc")),
    Two("Tiles with 2 copies", Arrays.asList("cccc", "bbbb", "dacc", "cdac", "ccda",
            "accd", "dbba", "adbb", "badb", "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd")),
    All("All tile types", Arrays.asList("aacb", "cbaa", "acba", "baac", "aaaa", "cbcb", "bcbc",
            "cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb",
            "bbad", "ddbc", "cddb", "bcdd", "dbcd", "adad", "dada", "dddd"));

    private final String longName;
    private final List<String> tiles;

    TilesEnum(String name, List<String> tiles){
        this.longName = name;
        this.tiles = tiles;
    }

    public List<String> getTiles(){
        return tiles;
    }

    public String getLongName(){
        return longName;
    }
}
