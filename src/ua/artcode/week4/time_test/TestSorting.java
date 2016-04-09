package ua.artcode.week4.time_test;

import ua.artcode.utils.time.ITimeAction;
import ua.artcode.utils.time.TimeCounter;
import ua.artcode.week4.sort.SortUtils;

import java.util.Arrays;

/**
 * Created by serhii on 09.04.16.
 */
public class TestSorting {


    public static void main(String[] args) {
        int[] mas = new int[100_000];

        // java8
        int[] copy1 = Arrays.stream(mas).map((e) -> (int)(Math.random() * 1000)).toArray();
        int[] copy2 = Arrays.copyOf(copy1, copy1.length);

        System.out.println("start bubble sort");
        long res = TimeCounter.count(new BubbleSortTimeAction(mas));
        System.out.println("bubble sort time " + res);


        // local anonym class
        ITimeAction innerSortJava = new ITimeAction() { // MyAnonClass
            @Override
            public void doAction() {
                Arrays.sort(mas);
            }
        };

        long arraysSortRes = TimeCounter.count(innerSortJava);
        System.out.println("arrays sort time " + arraysSortRes);

    }
}

class BubbleSortTimeAction implements ITimeAction {

    private int[] mas;

    public BubbleSortTimeAction(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void doAction() {
        SortUtils.selectionSort(mas);
    }
}
