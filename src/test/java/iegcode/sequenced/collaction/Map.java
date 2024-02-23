package iegcode.sequenced.collaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Map {

    @Test
    void map() {
        SequencedMap<String, String> map = new TreeMap<>();
        map.put("c", "Ibrahim");
        map.put("b", "El");
        map.put("a", "Gibran");

        Assertions.assertEquals("Gibran", map.firstEntry().getValue());
        Assertions.assertEquals("Ibrahim", map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();
        Assertions.assertEquals("Gibran", reversed.lastEntry().getValue());
        Assertions.assertEquals("Ibrahim", reversed.firstEntry().getValue());
    }


    @Test
    void linkedMap() {
        SequencedMap<String, String> map = new LinkedHashMap<>();
        map.putFirst("a", "Ibrahim");
        map.putFirst("b", "El");
        map.putFirst("c", "Gibran");

        Assertions.assertEquals("Gibran", map.firstEntry().getValue());
        Assertions.assertEquals("Ibrahim", map.lastEntry().getValue());
    }
}
