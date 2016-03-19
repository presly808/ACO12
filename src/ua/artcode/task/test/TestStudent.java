package ua.artcode.task.test;

import ua.artcode.task.model.Student;
import ua.artcode.task.util.StudentUtils;

public class TestStudent {
    // psvm
    public static void main(String[] args) {


        // create instance(initialize all fields),
        // allocate memory for student
        Student student1 = new Student();

        Student st2 = null;

        student1.init("Sasha","kiev@gmail.com","Kiev", 4000.50);

        // System.out.println(student1.street.toLowerCase());
        // null.toLowerCase() NullPointerException

        System.out.println(StudentUtils.convertStudent(student1));
        System.out.println(student1.convertStudent());


        st2 = student1;

        student1 = null;


    }


}
