package ua.artcode.design_patterns.decorator;

/**
 * Created by serhii on 20.04.16.
 */
public class ActionNode {

    private String value;

    private ActionNode next;

    public ActionNode(String value, ActionNode next) {
        this.value = value;
        this.next = next;
    }

    public String action(){
        return next != null ? next.action() + value : value;
    }


}
