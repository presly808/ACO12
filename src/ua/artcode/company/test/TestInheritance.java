package ua.artcode.company.test;

import ua.artcode.company.model.Coder;
import ua.artcode.company.model.Tester;
import ua.artcode.company.model.Worker;

/**
 * Created by serhii on 26.03.16.
 */
public class TestInheritance {


    public static void main(String[] args) {
        Coder coder = new Coder(1,"Vania",3000,"+380","JAVA");
        coder.getId();
        coder.code();

        Worker worker = new Worker();

        // Abstraction, is-a
        Worker worker2 = new Coder();
        //worker2.code();


        Tester tester = new Tester(2,"Tester Kolia", 2500, "2", "Auto");



    }

    public static void startWork(Worker worker){
        if(worker instanceof Coder){ // is-a checker (hierarchy)
            Coder coderRef = (Coder) worker;
            coderRef.code();
        } else if(worker.getClass() == Tester.class){ // no hierarchy checking
            Tester tester = (Tester) worker;
            tester.test();
        } else {
            worker.work();
        }
    }

    public static void startWork2(Worker worker){
        worker.work();
    }
}
