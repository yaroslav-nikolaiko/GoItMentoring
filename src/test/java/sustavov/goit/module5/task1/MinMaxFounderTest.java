package sustavov.goit.module5.task1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yaroslav on 6/4/16.
 */
public class MinMaxFounderTest {
    MinMaxFounder minMaxFounder = new MinMaxFounder();

    @Test
    public void testNegativeAndPositive() throws Exception {
        int[] input = {1, -2, 5, 4};
        minMaxFounder.minMaxElement(input);

        assertEquals(input.toString(), -2, minMaxFounder.getMin());
        assertEquals(5, minMaxFounder.getMax());
    }

    @Test
    public void testNegative() throws Exception {
        int[] input = {-1, -2, -5, -4};
        minMaxFounder.minMaxElement(input);

        assertEquals(-5, minMaxFounder.getMin());
        assertEquals(-1, minMaxFounder.getMax());
    }

    @Test
    public void testNegativeAndZero() throws Exception {
        int[] input = {-1, -2, 0, -4};
        minMaxFounder.minMaxElement(input);

        assertEquals(-4, minMaxFounder.getMin());
        assertEquals(0, minMaxFounder.getMax());
    }

    @Test
    public void testPositive() throws Exception {
        int[] input = {1, 2, 0, 4, 3};
        minMaxFounder.minMaxElement(input);

        assertEquals(0, minMaxFounder.getMin());
        assertEquals(4, minMaxFounder.getMax());
    }

    @Test
    public void testSinglePositive() throws Exception {
        int[] input = {1};
        minMaxFounder.minMaxElement(input);

        assertEquals(1, minMaxFounder.getMin());
        assertEquals(1, minMaxFounder.getMax());
    }

    @Test
    public void testSingleZero() throws Exception {
        int[] input = {0};
        minMaxFounder.minMaxElement(input);

        assertEquals(0, minMaxFounder.getMin());
        assertEquals(0, minMaxFounder.getMax());
    }

    @Test
    public void testSingleNegative() throws Exception {
        int[] input = {-1};
        minMaxFounder.minMaxElement(input);

        assertEquals(-1, minMaxFounder.getMin());
        assertEquals(-1, minMaxFounder.getMax());
    }

    @Test
    public void testEmpty() throws Exception {
        int[] input = {};
        minMaxFounder.minMaxElement(input);

        assertTrue(minMaxFounder.isEmpty());
    }

}