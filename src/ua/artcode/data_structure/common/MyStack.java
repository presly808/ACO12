package ua.artcode.data_structure.common;

/**
 * Created by serhii on 10.04.16.
 */
public interface MyStack<T> extends Iterable<T> {

    void push(T obj);

    T pop();


}
