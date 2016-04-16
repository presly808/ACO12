package ua.artcode.data_structure.static_str;

import ua.artcode.data_structure.common.MyIterator;
import ua.artcode.data_structure.common.MyStack;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by serhii on 10.04.16.
 */
public class MyArrayStack implements MyStack {

    private Object[] mas;
    private int top;

    public MyArrayStack(int size) {
        mas = new Object[size];
    }

    @Override
    public void push(Object obj) {
        if(top == mas.length){
            System.out.println("Stack is full");
            return;
        }
        mas[top++] = obj;
    }

    @Override
    public Object pop() {
        Object forRet = mas[--top];
        mas[top] = null;
        return forRet;
    }

    @Override
    public Iterator iterator() {
        return new MyArrayStackIterator(mas,top - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = top - 1; i > 0; i--) {
            sb.append(mas[i]).append("\n");
        }

        return "MyArrayStack{\n" +
                sb +
                '}';
    }

    // nested, use inner and private
    public static class MyArrayStackIterator implements Iterator {

        private Object[] mas;
        private int curr;

        public MyArrayStackIterator(Object[] mas, int top) {
            this.mas = mas;
            curr = top;
        }

        @Override
        public Object next() {
            Object last = mas[curr];
            curr--;
            return last;
        }

        @Override
        public boolean hasNext() {
            return curr >= 0;
        }
    }

}
