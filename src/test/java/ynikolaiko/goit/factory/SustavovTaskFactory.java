package ynikolaiko.goit.factory;

import sustavov.goit.module5.task1.MinMaxFounder;
import sustavov.goit.module5.task2.QuickSortAlgorithm;
import ynikolaiko.goit.TaskFactory;
import ynikolaiko.goit.module5.task1.MinMaxSearcher;
import ynikolaiko.goit.module5.task2.SortAlgorithm;

/**
 * Created by yaroslav on 6/8/16.
 */
public class SustavovTaskFactory extends TaskFactory {
    @Override
    public MinMaxSearcher minMaxSearcher() {
        return new MinMaxSearcher(){
            MinMaxFounder founder;
            @Override
            public void set(int[] input) {
                founder = new MinMaxFounder();
                founder.minMaxElement(input);
            }

            @Override
            public int getMin() {
                return founder.getMin();
            }

            @Override
            public int getMax() {
                return founder.getMax();
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
                QuickSortAlgorithm.sort(array);
                return array;
            }
        };
    }
}
