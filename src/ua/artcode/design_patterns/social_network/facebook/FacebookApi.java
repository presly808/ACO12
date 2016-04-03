package ua.artcode.design_patterns.social_network.facebook;

import ua.artcode.design_patterns.social_network.common.SocialNetworkApi;

/**
 * Created by serhii on 03.04.16.
 */
public class FacebookApi implements SocialNetworkApi {


    @Override
    public String login(String email, String pass){
        return "facebook key";
    }

    @Override
    public int createGroup(String name){
        System.out.println("Facebook group " + name);
        return 1;
    }

    public FacebookGroup get(int id){
        return new FacebookGroup();
    }

}
