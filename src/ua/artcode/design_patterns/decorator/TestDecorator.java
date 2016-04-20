package ua.artcode.design_patterns.decorator;

import java.io.*;

/**
 * Created by serhii on 20.04.16.
 */
public class TestDecorator {

    public static void main(String[] args) throws IOException {

        ActionNode actionNode2 = new ActionNode("2", null);

        ActionNode actionNode1 = new ActionNode("1", actionNode2);

        ActionNode actionNode = new ActionNode("0", actionNode1);

        String res = actionNode.action();


        String name = "temp/write_res.txt";
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new BufferedInputStream(
                                System.in)));


        String next = bufferedReader.readLine();





    }
}
