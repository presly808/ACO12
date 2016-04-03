package ua.artcode.design_patterns.social_network.observer;

/**
 * Created by serhii on 03.04.16.
 */
public class Gumanitariy implements ISubscriber{
    @Override
    public void notify(String message) {
        System.out.println(message + " mark as spam");
    }
}
