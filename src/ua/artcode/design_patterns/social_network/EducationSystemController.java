package ua.artcode.design_patterns.social_network;

import ua.artcode.design_patterns.social_network.common.SocialNetworkApi;
import ua.artcode.design_patterns.social_network.exception.InvalidLoginException;
import ua.artcode.design_patterns.social_network.exception.MyApplicationException;
import ua.artcode.design_patterns.social_network.exception.SocialNetworkException;
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

    public String login(String email, String pass) throws InvalidLoginException, MyApplicationException {

        if(!email.contains("@")){
            throw new InvalidLoginException("invalid email");
        }

        try {
            String message = socialNetworkApi.login(email, pass);
            return message;
        } catch (SocialNetworkException e) {
            e.printStackTrace();
            throw new MyApplicationException("social network error");
        }


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
