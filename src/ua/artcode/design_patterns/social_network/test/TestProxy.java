package ua.artcode.design_patterns.social_network.test;

import ua.artcode.design_patterns.social_network.EducationSystemController;
import ua.artcode.design_patterns.social_network.exception.InvalidLoginException;
import ua.artcode.design_patterns.social_network.exception.MyApplicationException;

/**
 * Created by serhii on 03.04.16.
 */
public class TestProxy {

    public static void main(String[] args) throws InvalidLoginException, MyApplicationException {
        EducationSystemController controller =
                new EducationSystemController();

        String res = controller.login("presly808","12345");

        System.out.println(res);


    }
}
