package ua.artcode.design_patterns.social_network.common;

/**
 * Created by serhii on 03.04.16.
 */
public interface SocialNetworkApi {

    String login(String email, String pass);

    int createGroup(String name);

}
