package ua.artcode.week6.io;

import ua.artcode.week6.Robot;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 20.04.16.
 */
public class TestRobotSaving {

    public static final String LOCATION = "temp/robot.txt";
    public static final String SERIAL_PATH = "temp/serialized_robot.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Robot robot = new Robot(1,"NN34", 100000);

        IOUtils.writeRobot(LOCATION,robot);

        try {
            Robot robot1 = IOUtils.readRobot(LOCATION);

            System.out.println("Loaded");
            System.out.println(robot1);
        } catch (FileNotFoundException e) {
            System.out.println("file with robot not found");
        }


        IOUtils.save(robot, SERIAL_PATH);
        Robot loaded2 = (Robot) IOUtils.load(SERIAL_PATH);

        System.out.println("Deserialized robot");
        System.out.println(loaded2);

    }
}
