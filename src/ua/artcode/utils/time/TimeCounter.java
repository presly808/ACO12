package ua.artcode.utils.time;

/**
 * Created by serhii on 09.04.16.
 */
public class TimeCounter {


    public static long count(ITimeAction action){

        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();

        return end - start;
    }

}
