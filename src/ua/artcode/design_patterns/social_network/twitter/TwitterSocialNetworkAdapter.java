package ua.artcode.design_patterns.social_network.twitter;

import ua.artcode.design_patterns.social_network.common.SocialNetworkApi;

/**
 * Created by serhii on 03.04.16.
 */
public class TwitterSocialNetworkAdapter implements SocialNetworkApi {

    private TwitterApi twitterApi;

    public TwitterSocialNetworkAdapter(TwitterApi twitterApi) {
        this.twitterApi = twitterApi;
    }

    @Override
    public String login(String email, String pass) {
        return null;
    }

    @Override
    public int createGroup(String name) {

        String postId = twitterApi.createPost(name);

        String intValue = postId.split("=")[1];
        return Integer.parseInt(intValue);
    }
}
