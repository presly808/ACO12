package ua.artcode.task.model;

/**
 * Created by serhii on 19.03.16.public int birthYear;
    public int birthMonth;
    public int birthDay;
 */
public class Student {

    // fields, properties
    // has-a
    private String name;
    private String phone;
    private String email = "none";

    private MyDate myDate = new MyDate(); //

    private double paidMoney;

    private String city;
    private String street;
    private String houseNum;

    private int taskCount;

    public String convertStudent(){

        // "name %s, phone %s, money %.2f, birthYear %d",
        return String.format("name %s, phone %s, money %.2f, birthYear %d",
                name, phone, paidMoney, myDate.birthYear);
    }

    public void init(String name, String phone, String city, double paidMoney) {

        Student me = this;

        this.name = name;
        this.phone = phone;
        this.city = city;
        this.paidMoney = paidMoney;
    }


}
