package ua.artcode.taxi.utils;

import com.sun.xml.internal.ws.util.ByteArrayBuffer;


import java.io.*;

/**
 * Created by serhii on 18.04.16.
 */
public class IOUtils {


    public static byte[] readBytes(String location) throws FileNotFoundException {
        InputStream is = new FileInputStream(location);
        ByteArrayBuffer resultArray = new ByteArrayBuffer();

        try {
            int next = -1;
            while ((next = is.read()) != -1) {
                resultArray.write(next);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultArray.getRawData();

    }

    public static byte[] readBytes(String location, int buffSize) throws FileNotFoundException {
        InputStream is = new FileInputStream(location);
        ByteArrayBuffer resultArray = new ByteArrayBuffer();

        byte[] buff = new byte[buffSize];
        int last = 0;

        try {
            int count = -1;
            while ((count = is.read(buff)) != -1) {
                resultArray.write(buff, 0, count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultArray.getRawData();

    }


    public static void writeBytes(byte[] arr, String location) throws FileNotFoundException {

        OutputStream os = new FileOutputStream(location);

        try {
            for (byte b : arr) {
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static void writeBytesCloseResources(byte[] arr, String location) throws FileNotFoundException {


        try (OutputStream os = new FileOutputStream(location)) {
            for (byte b : arr) {
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String readString(String location) throws FileNotFoundException {

        StringBuilder sb = new StringBuilder();
        char[] buff = new char[1000];

        int last = -1;
        try (Reader reader = new FileReader(location)) {
            while ((last = reader.read(buff)) != -1) {
                sb.append((char) last);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static void writeString(String source, String location) throws FileNotFoundException {


        try (Writer writer = new FileWriter(location)) {
            writer.write(source);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Serialization
    public static void save(Object any, String location){
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream(location))){

            oos.writeObject(any);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object load(String location) throws FileNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(location));
            Object loaded = ois.readObject();
            return loaded;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }





















}
