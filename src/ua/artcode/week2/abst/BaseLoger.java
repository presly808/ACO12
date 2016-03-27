package ua.artcode.week2.abst;

/**
 * Created by serhii on 27.03.16.
 */
public abstract class BaseLoger {

    public final void start(){
        System.out.println("Start action");
        action();
        System.out.println("End action");
    }


    public abstract void action();
}
