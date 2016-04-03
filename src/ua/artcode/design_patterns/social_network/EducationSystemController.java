package ua.artcode.design_patterns.social_network;

import ua.artcode.design_patterns.social_network.common.SocialNetworkApi;
import ua.artcode.design_patterns.social_network.facebook.FacebookApi;
import ua.artcode.design_patterns.social_network.observer.ISubscriber;
import ua.artcode.task.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 03.04.16.
 */
public class EducationSystemController {


    private List<ISubscriber> subscriberList = new ArrayList<>();
    private SocialNetworkApi socialNetworkApi = SocialNetworkApiFactory.create();

    // return course id
    public int createCourse(Course course){
        return socialNetworkApi.createGroup("name");
    }

    public String login(String email, String pass){
        return socialNetworkApi.login(email, pass);
    }

    public Course getCourse(int id){
        return null;
    }

    public void subscribe(ISubscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void notifyAll(String message){
        for (ISubscriber iSubscriber : subscriberList) {
            iSubscriber.notify(message);
        }
    }

    public SocialNetworkApi getSocialNetworkApi() {
        return socialNetworkApi;
    }

    public void setSocialNetworkApi(SocialNetworkApi socialNetworkApi) {
        this.socialNetworkApi = socialNetworkApi;
    }


}
