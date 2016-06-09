package sustavov.goit.module5.task2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;
import static sustavov.goit.module5.task2.QuickSortAlgorithm.sort;

/**
 * Created by yaroslav on 6/4/16.
 */
public class QuickSortAlgorithmTest {

    @Test
    public void testPositive() throws Exception {
        int[] array = {4, 2, 6, 4, 7, 45, 78, 6};
        int[] expected = {2,4,4,6,6,7,45,78};

        sort(array);

        assertArrayEquals(expected,array);
    }

    @Test
    public void testNegative() throws Exception {
        int[] array = {-4, -2, -6, -4, -7};
        int[] expected = {-7, -6, -4, -4, -2};

        sort(array);

        assertArrayEquals(expected,array);
    }

    @Test
    public void testNegativeAndPositive() throws Exception {
        int[] array = {-4, -2, -6, 4, -7, 0};
        int[] expected = {-7, -6, -4, -2, 0, 4};

        sort(array);

        assertArrayEquals(expected,array);
    }

    @Test
    public void testSinglePositive() throws Exception {
        int[] array = {1};
        int[] expected = {1};

        sort(array);

        assertArrayEquals(expected,array);
    }

    @Test
    public void testSingleNegative() throws Exception {
        int[] array = {-4};
        int[] expected = {-4};

        sort(array);

        assertArrayEquals(expected,array);
    }
}