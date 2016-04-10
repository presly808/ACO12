package ua.artcode.data_structure.dynamic;

import ua.artcode.data_structure.common.MyStack;
import ua.artcode.utils.ds.NodeUtils;

/**
 * Created by serhii on 10.04.16.
 */
public class MyLinkedStack implements MyStack {

    private Node top;

    @Override
    public void push(Object obj) {
        if(top == null){
            top = new Node(obj, null);
        } else {
            Node newNode = new Node(obj,top);
            top = newNode;
        }

        // above code could be replaced by top = new Node(obj,top)
    }

    @Override
    public Object pop() {

        if(top == null){
            System.out.println("Stack is empty");
            return null;
        }

        Object forRet = top.val;
        top = top.next;
        return forRet;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{\n" +
                "top=" + NodeUtils.toStringR(top).replaceAll("->","\n") +
                '}';
    }
}
