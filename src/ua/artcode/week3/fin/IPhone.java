package ua.artcode.week3.fin;

/**
 * Created by serhii on 02.04.16.
 */
public class IPhone {

    private final int screenSize;
    private final int ram;
    private final int flashMemory;
    private final String model;
    private final CloudAccount account;

    public IPhone() {
        this(6,2,16,"5s","default", "1234");
    }

    public IPhone(int screenSize, int ram,
                  int flashMemory, String model,
                  String name, String pass) {
        this.screenSize = screenSize;
        this.ram = ram;
        this.flashMemory = flashMemory;
        this.model = model;
        account = new CloudAccount(name,pass);

    }

    public void testFinal(){
        // flashMemory = 23;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getFlashMemory() {
        return flashMemory;
    }

    public String getModel() {
        return model;
    }

    public CloudAccount getAccount() {
        return account;
    }

    public final void start(){
        System.out.println("start iphone");
    }
}
