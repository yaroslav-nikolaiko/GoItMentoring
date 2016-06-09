package ynikolaiko.goit.some;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yaroslav on 6/7/16.
 */
public class ArraySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        System.out.println("Введіть " + array.length + " елеменів масиву");
        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Maximum Element - " + maxArrayElement(array));
        System.out.println("Minumum element - " + minArrayElement(array));


        System.out.println("Виберіть спосіб сортіровки масив : \n 1 - від найменьшого елемента \n 2 - від найбільшого елементу");
        int r = Integer.parseInt(reader.readLine());
        if (r == 1){
            for (int a: maxSortArray(array)) {
                System.out.println(a);
            }
        }else if (r == 2){
            for (int number : minSortArray(array)){
                System.out.println(number);
            }
        }

    }


    public static int maxArrayElement(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max <= array[i]) max = array[i];
        }
        return max;
    }

    public static int minArrayElement(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(max >= array[i]) max = array[i];
        }
        return max;
    }


    public static int[] maxSortArray(int[] arr){

        boolean swap = true;

        while (swap){
            swap = false;
            for (int i = 0; i < arr.length - 1 ; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap = true;
                }
            }
        }
        return arr;
    }
    public static int[] minSortArray(int[] arr){
        boolean swap = true;
        while (swap){
            swap = false;
            for (int i = 0; i > arr.length - 1 ; i++) {
                if (arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap = true;
                }
            }
        }
        return arr;
    }
}
