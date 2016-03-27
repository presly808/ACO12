package ua.artcode.company.model;

/**
 * Created by serhii on 26.03.16.
 */
public class Coder extends Worker { // is-a
    // get methods and fields (public, protected)

    private String programmingLanguage;

    public Coder() {
        //super();
        //super(-1,"Coder",3000,"undefined");
        super();
        System.out.println("Coder constructor");
    }

    public Coder(int id, String name, double salary,
                 String phone, String programmingLanguage){
        super(id, name, salary, phone);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void code(){
        System.out.println("coder code");
    }


    @Override
    public void work() {
        System.out.println("Coder work");
    }


    public String toString(){
        return String.format("id %d name %s", getId(), getName());
    }
}
