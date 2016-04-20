package ua.artcode.design_patterns.social_network.test;

import ua.artcode.design_patterns.social_network.EducationSystemController;
import ua.artcode.design_patterns.social_network.exception.InvalidLoginException;
import ua.artcode.design_patterns.social_network.exception.MyApplicationException;
import ua.artcode.design_patterns.social_network.facebook.FacebookApi;
import ua.artcode.design_patterns.social_network.vk.PowerPoint;
import ua.artcode.design_patterns.social_network.vk.VkApi;
import ua.artcode.design_patterns.social_network.vk.VkServer;

/**
 * Created by serhii on 03.04.16.
 */
public class TestStrategy {


    public static void main(String[] args) throws InvalidLoginException, MyApplicationException {
        EducationSystemController systemController = new EducationSystemController();

        systemController.setSocialNetworkApi(new FacebookApi());
        String res1 = systemController.login("email", "1234");
        System.out.println(res1);


        VkApi socialNetworkApi = new VkApi(new VkServer(new PowerPoint(220,"USA"),"i7", 128, 3000));
        systemController.setSocialNetworkApi(socialNetworkApi);
        String res2 = systemController.login("email", "1234");
        System.out.println(res2);
    }
}
