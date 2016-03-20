package ua.artcode.task.model;

/**
 * Created by serhii on 20.03.16.
 */
public class MyGroup {

    private static final int DEFAULT_GROUP_SIZE = 15;
    private Student[] listStudent;
    private String name;
    private int size;

    // Ctrl + Shift + /
    /*public MyGroup(){
        this("no name", DEFAULT_GROUP_SIZE);
    }*/


    public MyGroup(String name){
        this.name = name;
        listStudent = new Student[DEFAULT_GROUP_SIZE];
    }

    public MyGroup(String name, int placesCount){
        listStudent = new Student[placesCount];
        this.name = name;
    }

    public boolean addStudent(Student student) {
        if(student == null){
            System.out.println("student is null");
            return false;
        }

        if(size == listStudent.length){
            System.out.println("group is full");
            return false;
        }

        listStudent[size++] = student;

        return true;
    }

    public Student[] search(String name){
        return null;
    }

    public Student get(int indexPlace){
        return null;
    }

    public Student remove(int indexPlace){
        return null;
    }

    public void showAll(){

    }

    public int getSize(){
        return size;
    }
}
