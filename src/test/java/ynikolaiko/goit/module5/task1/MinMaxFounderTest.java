package ynikolaiko.goit.module5.task1;

import org.junit.Test;
import ynikolaiko.goit.AbstractTest;

import static org.junit.Assert.assertEquals;

/**
 * Created by yaroslav on 6/4/16.
 */
public class MinMaxFounderTest extends AbstractTest {;
    MinMaxSearcher minMaxSearcher = taskFactory.minMaxSearcher();

    @Test
    public void testNegativeAndPositive() throws Exception {
        int[] input = {1, -2, 5, 4};
        minMaxSearcher.set(input);

        assertEquals( -2, minMaxSearcher.getMin());
        assertEquals(5, minMaxSearcher.getMax());
    }

    @Test
    public void testNegative() throws Exception {
        int[] input = {-1, -2, -5, -4};
        minMaxSearcher.set(input);

        assertEquals(-5, minMaxSearcher.getMin());
        assertEquals(-1, minMaxSearcher.getMax());
    }

    @Test
    public void testNegativeAndZero() throws Exception {
        int[] input = {-1, -2, 0, -4};
        minMaxSearcher.set(input);

        assertEquals(-4, minMaxSearcher.getMin());
        assertEquals(0, minMaxSearcher.getMax());
    }

    @Test
    public void testPositive() throws Exception {
        int[] input = {1, 2, 0, 4, 3};
        minMaxSearcher.set(input);

        assertEquals(0, minMaxSearcher.getMin());
        assertEquals(4, minMaxSearcher.getMax());
    }

    @Test
    public void testSinglePositive() throws Exception {
        int[] input = {1};
        minMaxSearcher.set(input);

        assertEquals(1, minMaxSearcher.getMin());
        assertEquals(1, minMaxSearcher.getMax());
    }

    @Test
    public void testSingleZero() throws Exception {
        int[] input = {0};
        minMaxSearcher.set(input);

        assertEquals(0, minMaxSearcher.getMin());
        assertEquals(0, minMaxSearcher.getMax());
    }

    @Test
    public void testSingleNegative() throws Exception {
        int[] input = {-1};
        minMaxSearcher.set(input);

        assertEquals(-1, minMaxSearcher.getMin());
        assertEquals(-1, minMaxSearcher.getMax());
    }

}