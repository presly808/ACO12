package ua.artcode.week4.test_ds;

import ua.artcode.data_structure.common.MyStack;
import ua.artcode.data_structure.dynamic.MyLinkedStack;
import ua.artcode.data_structure.static_str.MyArrayStack;

/**
 * Created by serhii on 10.04.16.
 */
public class TestStack {

    public static void main(String[] args) {
        MyStack stack = new MyLinkedStack();

        for (int i = 0; i < 7; i++) {
            stack.push(i);
        }

        System.out.println(stack);
    }
}
