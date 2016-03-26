package ua.artcode.company.model;

/**
 * Created by serhii on 26.03.16.
 */
public class Manager {


    /*private Coder[] coders;
    private Tester[] testers;
    private Manager[] managers;

    public void addCoder(){}
    public void addTest(){}
    public void addManager(){}*/

    private Worker[] workers;

    public void addWorker(Worker worker){
        // add to the array
    }

    public void doTeamWork(){
        for (int i = 0; i < workers.length; i++) {
            workers[i].work();
        }
    }

}
