package ua.artcode.company.test;

import ua.artcode.company.controller.CompanyController;
import ua.artcode.company.model.Director;
import ua.artcode.company.model.Worker;

/**
 * Created by serhii on 26.03.16.
 */
public class TestPolymorphism {

    public static void main(String[] args) {
        Director director = new Director();
        CompanyController.startWork(director);

        Worker w1 = new Director();
        w1.getOwnSelf();
    }
}
