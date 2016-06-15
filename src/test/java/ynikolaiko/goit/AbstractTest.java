package ynikolaiko.goit;

/**
 * Created by yaroslav on 6/8/16.
 */
public abstract class AbstractTest {
    private Student student = Student.VSHEVEL;
    protected TaskFactory taskFactory = TaskFactory.create(student);
}
