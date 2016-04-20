package ua.artcode.week6.io;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 18.04.16.
 */
public class TestIO {


    public static void main(String[] args) throws FileNotFoundException {
        // locations
        // absolute, relative
        // current location
        byte[] arr1 = IOUtils.readBytes("/home/serhii/dev/IdeaProjects/ACO12/home/week4.txt");
        byte[] arr2 = IOUtils.readBytes("home/week4.txt");


        String converted = "";

        for (byte b : arr1) {
            converted += (char) b;
        }

        System.out.println(converted);
        String res = new String(arr1);
        System.out.println(res);

    }
}
