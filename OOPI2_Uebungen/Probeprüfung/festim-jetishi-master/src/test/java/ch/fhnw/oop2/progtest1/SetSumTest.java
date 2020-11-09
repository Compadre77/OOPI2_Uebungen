package ch.fhnw.oop2.progtest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class SetSumTest {

    @Test
    public void testSimple() {
        Set<Integer> set = Set.of(1, 2, 3);
        int res = CollectionTasks.setSum(set);
        assertEquals(6, res);
    }

    @Test
    public void testMore() {
        Set<Integer> set = Set.of(-3, 0, 4, -1, 2, 5, -7);
        int res = CollectionTasks.setSum(set);
        assertEquals(0, res);
    }

    @Test
    public void testNull() {
        int res = CollectionTasks.setSum(null);
        assertEquals(-1, res);
    }

    @Test
    public void testEmpty() {
        int res = CollectionTasks.setSum(Set.of());
        assertEquals(0, res);
    }

    @Test
    public void testOne() {
        int res = CollectionTasks.setSum(Set.of(42));
        assertEquals(42, res);
    }
}
