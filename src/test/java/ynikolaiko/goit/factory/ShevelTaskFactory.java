package ynikolaiko.goit.factory;

import vshevel.goit.module5.task1.ArrayBubblesortplusMinMax;
import ynikolaiko.goit.TaskFactory;
import ynikolaiko.goit.module5.task1.MinMaxSearcher;
import ynikolaiko.goit.module5.task2.SortAlgorithm;

/**
 * Created by ynikolaiko on 6/15/16.
 */
public class ShevelTaskFactory extends TaskFactory {
    @Override
    public MinMaxSearcher minMaxSearcher() {
        return new MinMaxSearcher() {
            int[] array;
            @Override
            public void set(int[] input) {
                this.array = input;
            }

            @Override
            public int getMin() {
                return ArrayBubblesortplusMinMax.min(array);
            }

            @Override
            public int getMax() {
                return ArrayBubblesortplusMinMax.max(array);
            }
        };
    }

    @Override
    public SortAlgorithm sortAlgorithm() {
        return new SortAlgorithm() {
            int[] array;
            @Override
            public void set(int[] array) {
                this.array = array;
            }

            @Override
            public int[] sort() {
                ArrayBubblesortplusMinMax.bubbleSort(array);
                return array;
            }
        };
    }
}
