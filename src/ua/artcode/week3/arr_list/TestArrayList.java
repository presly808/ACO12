package ua.artcode.week3.arr_list;

import ua.artcode.week3.fin.IPhone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by serhii on 02.04.16.
 */
public class TestArrayList {


    public static void main(String[] args) {
        List al = new ArrayList<>();

        al.add("Ivan");
        al.add(45);
        al.add(456.23);

        al.set(1, 48);

        Object removed = al.remove(1);

        al.add(0, new IPhone());

        Object obj = al.get(2);
        al.size();
        List list = al.subList(1,2);
        Object[] mas = list.toArray();

        for (int i = 0; i < list.size(); i++) {
            Object el = al.get(i);
        }

        // for each

        for(Object curr : al){
            System.out.println(curr);
        }


        int[] nums = {1,2,3,4,5,6};

        int j = 0;
        for (int curr : nums){
            j++;
            curr = 23;
        }


        // must be overrode equals
        boolean containsRes = al.contains(new IPhone());
        int index = al.indexOf(new IPhone());
        boolean removedResIPhone = al.remove(new IPhone());


        al.clear();

        boolean emptyRes  = al.isEmpty();


        Object o = 78;




    }

}
