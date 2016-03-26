package ua.artcode.company.test;

import ua.artcode.company.model.Director;
import ua.artcode.company.model.Manager;

/**
 * Created by serhii on 26.03.16.
 */
public class TestAggreagationComposition {


    public static void main(String[] args) {

        // lifecycle object
        // aggregation
        Manager manager = new Manager();
        Director director = new Director();
        director.setRightHand(manager);

        director = null;

        // Composition

        Director director1 = new Director();
        director1.setRightHand(new Manager());

        director1 = null;


    }
}
