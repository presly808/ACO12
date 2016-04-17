package ua.artcode.week5.generics;

import ua.artcode.data_structure.common.MyStack;
import ua.artcode.data_structure.static_str.MyArrayStack;

import java.util.Iterator;

/**
 * Created by serhii on 17.04.16.
 */
public class TestGenStack {


    public static void main(String[] args) {
        MyStack<Number> myArrayStack = new MyArrayStack<>(10);
        // myArrayStack.push();

        Iterator<Number> iterator = myArrayStack.iterator();




    }
}
