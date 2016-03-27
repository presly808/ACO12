package ua.artcode.week2.obj;

import ua.artcode.company.model.Coder;
import ua.artcode.company.model.Tester;
import ua.artcode.task.model.Student;

/**
 * Created by serhii on 27.03.16.
 */
public class TestObject {

    public static void main(String[] args) {
        Coder coder = new Coder();

        Object obj = coder;

        Object ref2 = new Coder();

        testObj(new TestObject());

        System.out.println(ref2);



    }


    public static void testObj(Object in){
        System.out.println(in);
    }
}
