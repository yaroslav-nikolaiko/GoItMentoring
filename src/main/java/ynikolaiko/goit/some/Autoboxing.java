package ynikolaiko.goit.some;

/**
 * Created by yaroslav on 6/1/16.
 */
public class Autoboxing {

    public static void main(String[] args) {
        Autoboxing autoboxing = new Autoboxing();
        //autoboxing.method(Integer.valueOf(1),Integer.valueOf(2));
        autoboxing.method(1,2);
    }


    void method(Integer a, Integer b) {
        System.out.println("Integer call");
    }

    void method(int a, int b) {
        System.out.println("int call");
    }


}
