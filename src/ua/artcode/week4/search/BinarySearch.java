package ua.artcode.week4.search;

/**
 * Created by serhii on 09.04.16.
 */
public class BinarySearch {

    public static int binaryIndexOf(int[] mas, int key){

        int start = 0;
        int end = mas.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(key < mas[mid]){
                end = mid - 1;
            } else if(key > mas[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


}
