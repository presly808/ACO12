package ua.artcode.week2.interf;

/**
 * Created by serhii on 27.03.16.
 */
public class WorldExample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Student student = new Student();
        SuperPerson superPerson = new SuperPerson();


        Company company = new Company();

        University university = new University();

        company.visit(employee);
        company.visit(superPerson);
        university.visit(student);
        university.visit(superPerson);



    }

}

interface IEmployee {

    void work();

}

class Company {

    void visit(IEmployee empl){
        empl.work();
    }

}

class University {

    void visit(IStudent student){
        student.study();
    }

}





class SuperPerson implements IEmployee, IStudent {

    @Override
    public void work() {
        System.out.println("SP work");
    }

    @Override
    public void study() {
        System.out.println("SP study");
    }
}

interface IStudent {
    void study();
}

class Student implements IStudent {

    public void study(){
        System.out.println("Student stydy");
    }

}

class Employee implements IEmployee {


    public void work(){
        System.out.println("Work");
    }

}
