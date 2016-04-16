package ua.artcode.design_patterns.social_network.exception;

/**
 * Created by serhii on 16.04.16.
 */
public class InvalidLoginException extends Exception {
    public InvalidLoginException(String s) {
        super(s);
    }
}
