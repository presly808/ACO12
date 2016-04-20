package ua.artcode.week6.io;

import com.sun.xml.internal.ws.util.ByteArrayBuffer;
import jdk.internal.util.xml.impl.ReaderUTF8;
import ua.artcode.week6.Robot;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

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

    /*// Robot - > id: 123, model :23423NM, price: 10000.00 - > to file
    public static void saveRobot(Robot robot, String location) throws IOException {
        String robotString = robot.toString();
        PrintWriter pw = new PrintWriter(new FileWriter(location));
        pw.write(robotString);
    }

    // String -> Robot
    public static Robot loadRobot(String location) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(location)));
        StringBuilder s = new StringBuilder();
        if (reader.readLine() == null) {
            s.append(reader.readLine());
        }
        String id = s.substring(0, s.indexOf(","));
        long a = Long.valueOf(id.substring(id.indexOf(":"), id.length() - 1));

        Robot r = new Robot(a, )


        return;
    }*/


    public static void writeRobot(String location, Robot robot){
        try(PrintWriter printWriter = new PrintWriter(new FileWriter(location))){
            String formatted = String.format("id:%d,model:%s,price:%.2f",
                    robot.getId(), robot.getModel(), robot.getPrice());
            printWriter.println(formatted);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Robot readRobot(String location) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(location));
        try {
            String robotStr = bufferedReader.readLine();

            if(robotStr != null){

                Robot robot = new Robot();

                String[] parts = robotStr.split(",");

                for (String part : parts) {

                    String[] keyValue = part.split(":");
                    String key = keyValue[0];
                    String value = keyValue[1];

                    if("id".equals(key)){
                        long id = Long.parseLong(value);
                        robot.setId(id);
                    } else if("model".equals(key)){
                        robot.setModel(value);
                    } else if("price".equals(key)){
                        double price = Double.parseDouble(value);
                        robot.setPrice(price);
                    }

                }

                return robot;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
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
