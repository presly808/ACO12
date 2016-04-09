package ua.artcode.week4.time_test;

import ua.artcode.utils.time.ITimeAction;
import ua.artcode.utils.time.TimeCounter;

/**
 * Created by serhii on 09.04.16.
 */
public class TestStringBuilder {


    public static void main(String[] args) {

        final int count = 100000;

        long strBuilderConc = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    sb.append(i); // concat
                }
            }
        });

        System.out.println("StringBuilder time " + strBuilderConc);

        long strCont = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                String res = "";
                for (int i = 0; i < count; i++) {
                    res = res + i; // concat
                }
            }
        });

        // String immutable class ->

        System.out.println("String concat " + strCont);




    }
}
