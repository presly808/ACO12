package ua.artcode.week4.search;

/**
 * Created by serhii on 09.04.16.
 */
public class LinearSearch {

    public static int indexOf(int[] mas, int key){

        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == key){
                return i;
            }
        }

        return -1;

    }




}
