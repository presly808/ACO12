package ua.artcode.week2.interf;

/**
 * Created by serhii on 27.03.16.
 */
public interface MyInterface extends IMusician, IProducer {

    // no constructor


    // only abstract methods
    // all meth - public abstract
    // field - public final static
}

class C implements MyInterface {

    @Override
    public void sing() {

    }

    @Override
    public void play() {

    }

    @Override
    public void produce() {

    }
}
