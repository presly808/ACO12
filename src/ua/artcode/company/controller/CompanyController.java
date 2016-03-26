package ua.artcode.company.controller;

import ua.artcode.company.model.Worker;

/**
 * Created by serhii on 26.03.16.
 */
public class CompanyController {

    // must be worker, override method work
    public static void startWork(Worker worker){
        // validation
        worker.work();
        // ...
        // post process action
    }

}
