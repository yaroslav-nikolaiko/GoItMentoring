package ynikolaiko.goit.oop;

/**
 * Created by ynikolaiko on 6/16/16.
 */
public class Child extends Parent {
    public static void f(){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent a = new Parent();
        Child b = new Child();
        a = b;
        //b = a;

        Parent o = new Child();
        o.f();
    }
}
