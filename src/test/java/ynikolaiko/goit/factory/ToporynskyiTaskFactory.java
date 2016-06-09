package ynikolaiko.goit.factory;

import toporynskyi.goit.module05.arraySort.BubbleSortArray;
import toporynskyi.goit.module05.maxminArray.FindMaxMin;
import ynikolaiko.goit.TaskFactory;
import ynikolaiko.goit.module5.task1.MinMaxSearcher;
import ynikolaiko.goit.module5.task2.SortAlgorithm;

/**
 * Created by yaroslav on 6/8/16.
 */
public class ToporynskyiTaskFactory extends TaskFactory {
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
                return FindMaxMin.findMinElement(input);
            }

            @Override
            public int getMax() {
                return FindMaxMin.findMaxElement(input);
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
                BubbleSortArray.bubbleSort(array);
                return array;
            }
        };
    }
}
