package ynikolaiko.goit.factory;

import org.apache.commons.lang3.ArrayUtils;
import stasyuk.goit.module5.Array;
import stasyuk.goit.module5.SortMassive;
import ynikolaiko.goit.TaskFactory;
import ynikolaiko.goit.module5.task1.MinMaxSearcher;
import ynikolaiko.goit.module5.task2.SortAlgorithm;

import java.util.Arrays;

/**
 * Created by yaroslav on 6/12/16.
 */
public class StasyukTaskFactory extends TaskFactory{
    @Override
    public MinMaxSearcher minMaxSearcher() {
        return new MinMaxSearcher() {
            int[] input;

            @Override
            public void set(int[] input) {
                this.input = input;
            }

            @Override
            public int getMin() {
                return Array.minValue(input);
            }

            @Override
            public int getMax() {
                return Array.maxValue(input);
            }
        };
    }

    @Override
    public SortAlgorithm sortAlgorithm() {
        return new SortAlgorithm() {
            int[] array;
            SortMassive sortMassive;
            @Override
            public void set(int[] array) {
                this.array = array;
                sortMassive = new SortMassive();
            }

            @Override
            public int[] sort() {
                int[] result = sortMassive.sort(array);
                ArrayUtils.reverse(result);
                return result;
            }
        };
    }
}
