package ua.artcode.week6.nio;

import com.sun.deploy.util.ArrayUtil;

import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by serhii on 19.04.16.
 */
public class TestNIO {


    public static void main(String[] args) throws FileNotFoundException {
        NIOUtils.readBytes("/home/serhii/dev/IdeaProjects/ACO12/home/week4.txt");

        int maxSize = 100_000;
        ByteBuffer byteBuffer = ByteBuffer.allocate(maxSize * 4);
        IntBuffer intBuffer = byteBuffer.asIntBuffer();

        Stream.generate(() -> (int)(Math.random() * 255)).limit(maxSize).forEach(intBuffer::put);


        byte[] dest = byteBuffer.array();

        NIOUtils.writeBytes(dest, "/home/serhii/dev/IdeaProjects/ACO12/temp/write_res.txt");
    }
}
