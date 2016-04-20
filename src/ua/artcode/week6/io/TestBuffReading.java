package ua.artcode.week6.io;

import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Created by serhii on 18.04.16.
 */
public class TestBuffReading {

    public static void main(String[] args) throws FileNotFoundException {
        byte[] res = IOUtils.readBytes("home/week3.txt", 1024);

        System.out.println(Arrays.toString(res));


    }
}
