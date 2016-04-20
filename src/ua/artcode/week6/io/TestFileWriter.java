package ua.artcode.week6.io;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 18.04.16.
 */
public class TestFileWriter {

    public static void main(String[] args) throws FileNotFoundException {
        IOUtils.writeString("asdfg", "temp/write_res.txt");
    }
}
