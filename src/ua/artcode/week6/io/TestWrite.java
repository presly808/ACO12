package ua.artcode.week6.io;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 18.04.16.
 */
public class TestWrite {

    public static final String PATH = "temp/write_res.txt";

    public static void main(String[] args) throws FileNotFoundException {
        String value = String.valueOf(System.currentTimeMillis());
        IOUtils.writeBytes(value.getBytes(), PATH);
    }
}
