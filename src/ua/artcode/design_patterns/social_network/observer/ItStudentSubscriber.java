package ua.artcode.design_patterns.social_network.observer;

/**
 * Created by serhii on 03.04.16.
 */
public class ItStudentSubscriber implements ISubscriber {
    @Override
    public void notify(String message) {
        System.out.println("I will read it (important) " + message);
    }
}
