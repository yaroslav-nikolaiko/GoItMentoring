package ynikolaiko.goit.some;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaroslav on 17.06.16.
 */
public class GenericExample {

    public <BLA> List<BLA> f(BLA param){
        ArrayList<BLA> list = new ArrayList<>();
        list.add(param);
        return list;
    }
}
