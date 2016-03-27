package ua.artcode.week2.abst;

/**
 * Created by serhii on 27.03.16.
 */
public class TestAbsr {


    public static void main(String[] args) {

        BaseLoger baseLoger = null;
        baseLoger.action();

        startLogging(new ConsoleLogger());

        startLogging(new FileLogger());
    }

    public static void startLogging(BaseLoger loger){
        loger.start();
    }
}
