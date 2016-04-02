package ua.artcode.week3.fin;

/**
 * Created by serhii on 02.04.16.
 */
public class TestIPhone {


    public static void main(String[] args) {
        final int key = 234;

        int copy = key;
       // val = 34;


        IPhone iPhone = new IPhone();

        iPhone.getModel();
        iPhone.getAccount().setName("Vasia");

    }
}
