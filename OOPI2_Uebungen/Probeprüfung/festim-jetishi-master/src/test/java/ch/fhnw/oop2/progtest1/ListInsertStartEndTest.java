package ch.fhnw.oop2.progtest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListInsertStartEndTest {

    @Test
    public void testSimple() {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        CollectionTasks.listInsertStartEnd(list, "x", "y");
        assertEquals(List.of("x", "y", "a", "b", "c", "x", "y"), list);
    }

    @Test
    public void testEmpty() {
        List<String> list = new ArrayList<>();
        CollectionTasks.listInsertStartEnd(list, "x", "y");
        assertEquals(List.of("x", "y", "x", "y"), list);
    }
}
