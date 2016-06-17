package ynikolaiko.goit.some;

import ynikolaiko.goit.oop.Child;
import ynikolaiko.goit.oop.Parent;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Created by ynikolaiko on 6/16/16.
 */
public class NavigableMapClastCastExceptionTry {
    public static void main(String[] args) {
        NavigableMap<Parent, Child> map = new TreeMap<>();
        //Will throw  java.lang.ClassCastException: ynikolaiko.goit.oop.Parent cannot be cast to java.lang.Comparable
        map.put(new Parent(), new Child());
        map.put(new Parent(), new Child());
        map.put(new Parent(), new Child());


        Map<Parent, Child> map2 = new TreeMap<>();
        //Will throw  java.lang.ClassCastException: ynikolaiko.goit.oop.Parent cannot be cast to java.lang.Comparable
        map2.put(new Parent(), new Child());
        map2.put(new Parent(), new Child());
        map2.put(new Parent(), new Child());
    }
}
