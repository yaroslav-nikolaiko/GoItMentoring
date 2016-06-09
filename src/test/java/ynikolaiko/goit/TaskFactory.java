package ynikolaiko.goit;

import ynikolaiko.goit.factory.SustavovTaskFactory;
import ynikolaiko.goit.factory.ToporynskyiTaskFactory;
import ynikolaiko.goit.module5.task1.MinMaxSearcher;
import ynikolaiko.goit.module5.task2.SortAlgorithm;

/**
 * Created by yaroslav on 6/8/16.
 */
public abstract class TaskFactory {
    public static TaskFactory create(Student student){
        switch (student) {
            case SUSTAVOV: return new SustavovTaskFactory();
            case TOPORYNSKYI: return new ToporynskyiTaskFactory();
        }
        return null;
    }
    public abstract MinMaxSearcher minMaxSearcher();
    public abstract SortAlgorithm sortAlgorithm();
}