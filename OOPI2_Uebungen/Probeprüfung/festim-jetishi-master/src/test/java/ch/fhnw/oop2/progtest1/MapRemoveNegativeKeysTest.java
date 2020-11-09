package ch.fhnw.oop2.progtest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class MapRemoveNegativeKeysTest {

    @Test
    public void testSimple() {
        Map<Integer, String> map = new HashMap<>(Map.of(
                1, "hi",
                2, "he",
                -3, "ho",
                4, "hey",
                -100, "ha"));
        CollectionTasks.mapRemoveNegativeKeys(map);
        assertEquals(Map.of(1, "hi", 2, "he", 4, "hey"), map);
    }

    @Test
    public void testAllNeg() {
        Map<Integer, String> map = new HashMap<>(Map.of(
                -1, "hi",
                -2, "he",
                -3, "ho",
                -4, "hey",
                -100, "ha"));
        CollectionTasks.mapRemoveNegativeKeys(map);
        assertEquals(Map.of(), map);
    }

    @Test
    public void testNonNeg() {
        Map<Integer, String> expected = Map.of(
                1, "hi",
                2, "he",
                3, "ho",
                4, "hey",
                100, "ha");
        Map<Integer, String> map = new HashMap<>(expected);
        CollectionTasks.mapRemoveNegativeKeys(map);
        assertEquals(expected, map);
    }

    @Test
    public void testEmpty() {
        Map<Integer, String> map = new HashMap<>(Map.of());
        CollectionTasks.mapRemoveNegativeKeys(map);
        assertEquals(Map.of(), map);
    }

    @Test
    public void testImmutable() {
        Map<Integer, String> map = Map.of();
        CollectionTasks.mapRemoveNegativeKeys(map);
        assertEquals(Map.of(), map);
    }
}
