package ua.artcode.week6.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by serhii on 20.04.16.
 */
public class TestFile {


    // file system operation
    // create, delete, search -> file or directory

    // exploring file system

    // last change time

    public static void main(String[] args) {
        // change file(directory) attributes
        // read, write, executable, creation date,
        File file = new File("temp/new_file.txt");

        if(!file.exists()){
            try {
                boolean result = file.createNewFile();

                file.canRead();
                file.canWrite();
                file.canExecute();

                file.setReadable(true);
                // etc

                // file.delete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File dir = new File("temp2/temp3/temp4");

        // create directory
        dir.mkdirs();

        String absolutePath = dir.getAbsolutePath();
        String relative = dir.getPath();
        String name = dir.getName();
        try {
            String canonical = dir.getCanonicalPath();

            System.out.println(absolutePath);
            System.out.println(relative);
            System.out.println(name);
            System.out.println(canonical);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(dir.isDirectory() && !dir.isFile()){

        }


        File tempDir = new File("temp");
        File[] children = tempDir.listFiles();
        File parentTemp = tempDir.getParentFile();

    }



}
