package ua.artcode.task.model;

/**
 * Created by serhii on 19.03.16.
 */
public class MyDate {


    public int birthYear;
    public int birthMonth;
    public int birthDay;

    public MyDate(int birthYear, int birthMonth, int birthDay) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        // return this;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
}
