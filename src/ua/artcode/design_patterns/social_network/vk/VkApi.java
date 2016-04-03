package ua.artcode.design_patterns.social_network.vk;

import ua.artcode.design_patterns.social_network.common.SocialNetworkApi;
import ua.artcode.design_patterns.social_network.facebook.FacebookGroup;


public class VkApi implements SocialNetworkApi {

    private VkServer server;

    public VkApi(VkServer server) {
        this.server = server;
    }

    @Override
    public String login(String email, String pass){
        return "vk key";
    }

    @Override
    public int createGroup(String name){
        System.out.println("Vk group " + name);
        return 1;
    }

    public VkGroup get(int id){
        return new VkGroup();
    }

}
