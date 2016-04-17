package ua.artcode.week5.generics;

/**
 * Created by serhii on 17.04.16.
 */
public class Container<T> {

    private T el;

    public Container() {
    }

    public Container(T el) {
        this.el = el;
    }

    public T getEl() {
        return el;
    }

    public void setEl(T el) {
        this.el = el;
    }
}
