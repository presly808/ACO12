package ua.artcode.design_patterns.social_network.common;

import ua.artcode.design_patterns.social_network.exception.SocialNetworkException;

/**
 * Created by serhii on 03.04.16.
 */
public class SocialNetworkProxy implements SocialNetworkApi {


    private SocialNetworkApi target;

    public SocialNetworkProxy(SocialNetworkApi target) {
        this.target = target;
    }

    @Override
    public String login(String email, String pass) throws SocialNetworkException {
        // validation
        // preprocess
        System.out.printf("email %s, pass %s\n", email,pass);

        return target.login(email,pass);
    }

    @Override
    public int createGroup(String name) {
        return 0;
    }
}
