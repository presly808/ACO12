package ua.artcode.task.util;

import ua.artcode.task.model.Address;
import ua.artcode.task.model.MyDate;
import ua.artcode.task.model.Student;

/**
 * Created by serhii on 19.03.16.
 */
public class StudentUtils {


    public static Student generateStudent(){
        String name = generateName();
        String phone = generatePhone();
        String mail = generateMail(name);

        Address address = generateAdress();
        MyDate myDate = generateDate();
        double paidMoney = generateMoney();


        return new Student(name,phone,mail,myDate,address,paidMoney,0);
    }

    private static double generateMoney() {
        return generateNum(0, 4001);
    }

    private static Address generateAdress() {
        return new Address("Kiev", "Starok", String.valueOf(generateNum(0,100)));
    }

    private static MyDate generateDate() {
        return new MyDate(generateNum(1970, 1990), generateNum(0,13), generateNum(0,32));
    }

    // [)
    private static int generateNum(int left, int right) {
        return left + (int)(Math.random() * (right - left));
    }

    private static String generateMail(String name) {
        return name + "@gmail.com";
    }

    private static String generatePhone() {
        String phone = "+380";

        for (int i = 0; i < 9; i++) {
            phone += (int)(Math.random() * 10);
        }

        return phone;
    }

    private static String generateName() {
        String[] names = {"Andrey", "Oleg",
                "Ivan", "Serhii", "Bogdan", "Kolia", "Yura"};

        return names[(int)(Math.random() * names.length)];
    }

}
