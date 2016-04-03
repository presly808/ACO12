package ua.artcode.design_patterns.social_network.common;

/**
 * Created by serhii on 03.04.16.
 */
public class SocialNetworkProxy implements SocialNetworkApi {


    private SocialNetworkApi target;

    public SocialNetworkProxy(SocialNetworkApi target) {
        this.target = target;
    }

    @Override
    public String login(String email, String pass) {
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
