package ua.artcode.design_patterns.social_network.test;

import ua.artcode.design_patterns.social_network.EducationSystemController;
import ua.artcode.design_patterns.social_network.observer.Gumanitariy;
import ua.artcode.design_patterns.social_network.observer.ItStudentSubscriber;

/**
 * Created by serhii on 03.04.16.
 */
public class TestObserver {

    public static void main(String[] args) {
        EducationSystemController controller = new EducationSystemController();


        controller.subscribe(new ItStudentSubscriber());
        controller.subscribe(new Gumanitariy());


        controller.notifyAll("New course. Auto QA");
    }
}
