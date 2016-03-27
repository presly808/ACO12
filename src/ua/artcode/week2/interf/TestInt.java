package ua.artcode.week2.interf;

/**
 * Created by serhii on 27.03.16.
 */
public class TestInt {

    public static void main(String[] args) {
        A a = new Con();
        a.a();

        B b = new Con();
        b.a();
    }
}

interface A {

    void a();
}

interface B {
    public abstract void a();
}

class Con implements A, B{

    @Override
    public void a() {

    }
}
