package ua.artcode.design_patterns.social_network.common;

import ua.artcode.design_patterns.social_network.exception.SocialNetworkException;

/**
 * Created by serhii on 03.04.16.
 */
public interface SocialNetworkApi {

    String login(String email, String pass) throws SocialNetworkException;

    int createGroup(String name);

}
