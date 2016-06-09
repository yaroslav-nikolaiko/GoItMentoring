package ynikolaiko.goit.module5.task2;

import org.junit.Test;
import ynikolaiko.goit.AbstractTest;

import static org.junit.Assert.assertArrayEquals;
import static sustavov.goit.module5.task2.QuickSortAlgorithm.sort;

/**
 * Created by yaroslav on 6/4/16.
 */
public class SortAlgorithmTest extends AbstractTest {
    SortAlgorithm sortAlgorithm = taskFactory.sortAlgorithm();

    @Test
    public void testPositive() throws Exception {
        int[] array = {4, 2, 6, 4, 7, 45, 78, 6};
        int[] expected = {2,4,4,6,6,7,45,78};
        test(array, expected);
    }

    @Test
    public void testNegative() throws Exception {
        int[] array = {-4, -2, -6, -4, -7};
        int[] expected = {-7, -6, -4, -4, -2};
        test(array, expected);
    }

    @Test
    public void testNegativeAndPositive() throws Exception {
        int[] array = {-4, -2, -6, 4, -7, 0};
        int[] expected = {-7, -6, -4, -2, 0, 4};
        test(array, expected);
    }

    @Test
    public void testSinglePositive() throws Exception {
        int[] array = {1};
        int[] expected = {1};
        test(array, expected);
    }

    @Test
    public void testSingleNegative() throws Exception {
        int[] array = {-4};
        int[] expected = {-4};
        test(array, expected);
    }

    private void test(int[] array, int[] expected){
        sortAlgorithm.set(array);
        assertArrayEquals(expected,sortAlgorithm.sort());
    }
}