package ua.artcode.week5.inner;

import ua.artcode.data_structure.common.MyIterator;
import ua.artcode.data_structure.dynamic.MyLinkedStack;

import java.util.Iterator;

/**
 * Created by serhii on 16.04.16.
 */
public class TestInner {

    public static void main(String[] args) {
        MyLinkedStack myLinkedStack = new MyLinkedStack();

        myLinkedStack.new MyLinkedStackIterator();


        Iterator myIterator = myLinkedStack.iterator();
    }
}
