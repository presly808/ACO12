package ua.artcode.company.model;

/**
 * Created by serhii on 26.03.16.
 */
public class Director extends Worker {

    private Manager rightHand;

    public Manager getRightHand() {
        return rightHand;
    }

    public void setRightHand(Manager rightHand) {
        this.rightHand = rightHand;
    }

    // extend access modifier protected - > public
    @Override
    public void work(){
        System.out.println("Director work method");
    }

    @Override
    public Director getOwnSelf() {// is-a
        return this;
    }
}
