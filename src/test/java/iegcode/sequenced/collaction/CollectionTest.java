package iegcode.sequenced.collaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class CollectionTest {

    @Test
    void collection() {
        SequencedCollection<String> list = new ArrayList<>();
        list.addLast("Gibran");
        list.addFirst("El");
        list.addFirst("Ibrahim");

        Assertions.assertEquals(List.of("Ibrahim", "El", "Gibran"), list);

        Assertions.assertEquals("Gibran", list.getLast());
        Assertions.assertEquals("Ibrahim", list.getFirst());

        SequencedCollection<String> reversed = list.reversed();
        Assertions.assertEquals(List.of("Gibran", "El", "Ibrahim"), reversed);

        String value = list.removeFirst();
        Assertions.assertEquals("Ibrahim", value);
        Assertions.assertEquals("El", list.getFirst());

        value = list.removeLast();
        Assertions.assertEquals("Gibran", value);
        Assertions.assertEquals("El", list.getLast());
    }
}
