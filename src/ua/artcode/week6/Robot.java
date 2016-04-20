package ua.artcode.week6;

import java.io.Serializable;

/**
 * Created by serhii on 20.04.16.
 */
public class Robot implements Serializable {

    private long id;
    private String model;
    private double price;
    private transient long pass;

    public Robot() {
    }

    public Robot(long id, String model, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
