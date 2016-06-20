package ynikolaiko.goit.constructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaroslav on 6/3/16.
 */
public class Child extends Parent {




    public Child(String param) {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Child("qwe");

        List<Parent> parents = new ArrayList<>();
        parents.add(new Child("qwe"));

    }
}
