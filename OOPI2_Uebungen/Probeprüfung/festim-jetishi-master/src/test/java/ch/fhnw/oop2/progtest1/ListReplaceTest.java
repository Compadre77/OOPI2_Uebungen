package ch.fhnw.oop2.progtest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class ListReplaceTest {

    @Test
    public void testSimple() {
        List<String> list = new ArrayList<>(List.of("stupid", "idiot", "why", "did", "you"));
        Map<String, String> map = Map.of("stupid", "unsmart","idiot", "fool");
        CollectionTasks.listReplace(list, map);
        assertEquals(List.of("unsmart", "fool"), list);
    }

    @Test
    public void testMultiple() {
        List<String> list = new ArrayList<>(
                List.of("stupid", "idiot", "why", "did", "stupid"));
        Map<String, String> map = Map.of(
                "stupid", "unsmart",
                "idiot", "fool");
        CollectionTasks.listReplace(list, map);
        assertEquals(List.of("unsmart", "fool", "unsmart"), list);
    }

    @Test
    public void testNothingLeft() {
        List<String> list = new ArrayList<>(
                List.of("why", "did", "you"));
        Map<String, String> map = Map.of(
                "stupid", "unsmart",
                "idiot", "fool");
        CollectionTasks.listReplace(list, map);
        assertEquals(List.of(), list);
    }

    @Test
    public void testNoReplacements() {
        List<String> list = new ArrayList<>(
                List.of("stupid", "idiot", "why", "did", "stupid"));
        CollectionTasks.listReplace(list, Map.of());
        assertEquals(List.of(), list);
    }

    @Test
    public void testEmpty() {
        List<String> list = new ArrayList<>();
        Map<String, String> map = Map.of(
                "stupid", "unsmart",
                "idiot", "fool");
        CollectionTasks.listReplace(list, map);
        assertEquals(List.of(), list);
    }
}
