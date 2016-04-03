package ua.artcode.design_patterns.social_network;

import ua.artcode.design_patterns.social_network.common.SocialNetworkApi;
import ua.artcode.design_patterns.social_network.common.SocialNetworkProxy;
import ua.artcode.design_patterns.social_network.vk.*;
import ua.artcode.design_patterns.social_network.vk.VkApi;

/**
 * Created by serhii on 03.04.16.
 */
public class SocialNetworkApiFactory {


    public static SocialNetworkApi create(){
        return new SocialNetworkProxy(new VkApi(new VkServer(new PowerPoint(220,"USA"),"i7", 128, 3000)));
    }

}
