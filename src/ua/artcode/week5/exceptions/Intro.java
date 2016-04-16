package ua.artcode.week5.exceptions;

import ua.artcode.design_patterns.social_network.Course;
import ua.artcode.design_patterns.social_network.EducationSystemController;
import ua.artcode.design_patterns.social_network.SocialNetworkApiFactory;
import ua.artcode.design_patterns.social_network.exception.InvalidLoginException;
import ua.artcode.design_patterns.social_network.exception.MyApplicationException;

/**
 * Created by serhii on 16.04.16.
 */
public class Intro {

    public static void main(String[] args) {
        EducationSystemController systemController =
                new EducationSystemController();

        String res = null;
        try {
            res = systemController.login("sdfsd", "sfsdf");
        } catch (MyApplicationException e) {
            e.printStackTrace();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }


        Course found = systemController.getCourse(-1);
        System.out.println(found);


        int i = systemController.createCourse(new Course());
        System.out.println(i);

    }
}
