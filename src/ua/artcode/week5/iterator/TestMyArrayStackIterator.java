package ua.artcode.week5.iterator;

import ua.artcode.data_structure.common.MyIterator;
import ua.artcode.data_structure.common.MyStack;
import ua.artcode.data_structure.dynamic.MyLinkedStack;
import ua.artcode.data_structure.static_str.MyArrayStack;

import java.util.Iterator;

/**
 * Created by serhii on 16.04.16.
 */
public class TestMyArrayStackIterator {

    public static void main(String[] args) {
        MyLinkedStack myArrayStack = new MyLinkedStack();
        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);
        myArrayStack.push(4);


        Iterator iterator = myArrayStack.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println();
        System.out.println("FOR-EACH");
        for(Object el : myArrayStack){
            System.out.println(el);
        }

        int[] mas = {1,2,3,4,5,6};

        for (int el : mas) { // iterator
            System.out.println(el);
        }


    }

}
