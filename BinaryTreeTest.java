import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BinaryTreeTest {

    BinaryTree<Integer> T;

    @BeforeEach
    public void setUp() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        T = new BinaryTree<>(list);
    }

    @Test
    public void test() {
        first_test();
        last_test();
        next_Ancestor();
        prev_ancestor();
        test_next();
        test_prev();
        test_advance();
    }

    @Test
    public void first_test() {
        assertEquals(0, T.getRoot().first().data);
        assertEquals(51, T.getRoot().right.first().data);
    }

    @Test
    public void last_test() {
        assertEquals(99, T.getRoot().last().data);
        assertEquals(49, T.getRoot().left.last().data);
    }

    @Test
    public void next_Ancestor() {
        assertNull(T.getRoot().nextAncestor());
        assertEquals(50, T.getRoot().left.nextAncestor().data);
        assertEquals(50, T.getRoot().left.right.nextAncestor().data);
        assertNull(T.getRoot().right.right.right.nextAncestor());
    }

    @Test
    public void prev_ancestor() {
        assertNull(T.getRoot().prevAncestor());
        assertEquals(50, T.getRoot().right.prevAncestor().data);
        assertEquals(50, T.getRoot().right.left.prevAncestor().data);
        assertNull(T.getRoot().left.left.left.prevAncestor());
    }

    @Test
    public void test_next() {
        assertEquals(96, T.getRoot().right.right.right.right.left.left.next().data);
    }

    @Test
    public void test_prev() {
        assertEquals(94, T.getRoot().right.right.right.right.left.left.previous().data);
    }
}
