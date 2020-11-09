package ch.fhnw.oop2.progtest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class MapMaxTest {

    @Test
    public void testSimple() {
        Map<String, Integer> map = Map.of(
                "foo", 3,
                "bar", 4,
                "baz", 5);
        Integer res = CollectionTasks.mapMax(map, "foo", "bar");
        assertEquals(4, res);
    }

    @Test
    public void testEqual() {
        Map<String, Integer> map = Map.of(
                "foo", 3,
                "bar", 3,
                "baz", 3);
        Integer res = CollectionTasks.mapMax(map, "foo", "bar");
        assertEquals(3, res);
    }

    @Test
    public void testOneAbsent() {
        Map<String, Integer> map = Map.of(
                "foo", 3,
                "bar", 4,
                "baz", 5);
        Integer res = CollectionTasks.mapMax(map, "foo", "meh");
        assertEquals(3, res);
    }

    @Test
    public void testOtherAbsent() {
        Map<String, Integer> map = Map.of(
                "foo", 3,
                "bar", 4,
                "baz", 5);
        Integer res = CollectionTasks.mapMax(map, "meh", "bar");
        assertEquals(4, res);
    }

    @Test
    public void testBothAbsent() {
        Map<String, Integer> map = Map.of(
                "foo", 3,
                "bar", 4,
                "baz", 5);
        Integer res = CollectionTasks.mapMax(map, "meh", "mah");
        assertEquals(null, res);
    }
}
