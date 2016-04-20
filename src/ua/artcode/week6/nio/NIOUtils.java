package ua.artcode.week6.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Paths;

/**
 * Created by serhii on 19.04.16.
 */
public class NIOUtils {


    public static void readBytes(String location) throws FileNotFoundException {
        FileChannel fileChannel = new FileInputStream(location).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1000);

        try {
            int count = 0;

            while((count = fileChannel.read(byteBuffer)) != -1){

                System.out.printf("count %d\n",count);

                byteBuffer.flip();

                System.out.println("portion");
                while (byteBuffer.hasRemaining()){
                    System.out.print((char) byteBuffer.get());
                }

                byteBuffer.clear();

            }




        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeBytes(byte[] src, String location) throws FileNotFoundException {
        FileChannel fileChannel = new FileOutputStream(location).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.wrap(src);


        try {
            int count = 0;

            while(byteBuffer.hasRemaining()){

                fileChannel.write(byteBuffer);
                //byteBuffer.flip();
                //byteBuffer.clear();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
