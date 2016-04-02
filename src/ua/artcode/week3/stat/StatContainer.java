package ua.artcode.week3.stat;

/**
 * Created by serhii on 02.04.16.
 */
public class StatContainer {
    

    private int val;


    static {
        System.out.println("Before");
    }

    public static int count = 10;

    static {
        // while loading class
        int res = 234 * 12 - 234;
        count = res;
        System.out.println("static block");
    }

    public static int random(){
        // val
        return (int)(Math.random() * count);
    }

    public int testNonStatic(){
        //
        return val + count;
    }


}
