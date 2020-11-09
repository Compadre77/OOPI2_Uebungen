package ch.fhnw.oop2.progtest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class SetSymmetricDiffTest {

    @Test
    public void testSimple() {
        Set<String> set1 = Set.of("a", "b", "c");
        Set<String> set2 = Set.of("c", "d", "e");
        Set<String> res = CollectionTasks.setSymmetricDiff(set1, set2);
        assertEquals(Set.of("a", "b", "d", "e"), res);
    }

    @Test
    public void testEmptyIntersection() {
        Set<String> set1 = Set.of("a", "b");
        Set<String> set2 = Set.of("d", "e");
        Set<String> res = CollectionTasks.setSymmetricDiff(set1, set2);
        assertEquals(Set.of("a", "b", "d", "e"), res);
    }

    @Test
    public void testSame() {
        Set<String> set = Set.of("a", "b");
        Set<String> res = CollectionTasks.setSymmetricDiff(set, set);
        assertEquals(Set.of(), res);
    }

    @Test
    public void testOneEmpty() {
        Set<String> set1 = Set.of("a", "b");
        Set<String> set2 = Set.of();
        Set<String> res = CollectionTasks.setSymmetricDiff(set1, set2);
        assertEquals(Set.of("a", "b"), res);
    }

    @Test
    public void testOtherEmpty() {
        Set<String> set1 = Set.of();
        Set<String> set2 = Set.of("a", "b");
        Set<String> res = CollectionTasks.setSymmetricDiff(set1, set2);
        assertEquals(Set.of("a", "b"), res);
    }

    @Test
    public void testBothEmpty() {
        Set<String> set = Set.of();
        Set<String> res = CollectionTasks.setSymmetricDiff(set, set);
        assertEquals(Set.of(), res);
    }
}
