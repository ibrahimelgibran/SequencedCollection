package iegcode.sequenced.collaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SetTest {

    @Test
    void set() {
        SequencedSet<String> set = new TreeSet<>();
        set.add("Ibrahim");
        set.add("El");
        set.add("Gibran");

        Assertions.assertEquals("El", set.getFirst());
        Assertions.assertEquals("Ibrahim", set.getLast());

        SequencedSet<String> reversed = set.reversed();

        Assertions.assertEquals("El", reversed.getLast());
        Assertions.assertEquals("Ibrahim", reversed.getFirst());

        String value = set.removeFirst();
        Assertions.assertEquals("El", value);
    }
}
