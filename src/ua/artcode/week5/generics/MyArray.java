package ua.artcode.week5.generics;

/**
 * Created by serhii on 17.04.16.
 */
public class MyArray<T> {

    private T[] mas;
    private int size;

    public MyArray(int size){
        mas = (T[]) new Object[size];
    }

    private void test(){
        //T el = new Object();
        Object o = mas[0];
    }


    private static void testStat(){
        // T el;
    }

    public void add(T el){
        if(size == mas.length){
            throw new ArrayStoreException("array is full");
        }

        mas[size++] = el;
    }

    public int size(){
        return size;
    }

    public void set(int index, T el){

    }

    public int indexOf(T el){
        return -1;
    }

}
