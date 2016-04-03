package ua.artcode.design_patterns.social_network.test;

import ua.artcode.design_patterns.social_network.EducationSystemController;
import ua.artcode.design_patterns.social_network.twitter.TwitterApi;
import ua.artcode.design_patterns.social_network.twitter.TwitterSocialNetworkAdapter;

/**
 * Created by serhii on 03.04.16.
 */
public class TestAdapter {

    public static void main(String[] args) {
        EducationSystemController systemController = new EducationSystemController();

        systemController.setSocialNetworkApi(new TwitterSocialNetworkAdapter(new TwitterApi()));
    }
}
