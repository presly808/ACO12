package ua.artcode.company.model;

/**
 * Created by serhii on 26.03.16.
 */
public class Tester extends Worker {

    private String type;

    public Tester(int id, String name,
                  double salary, String phone, String type) {
        super(id, name, salary, phone);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void test(){
        System.out.println("Tester test");
    }
}
