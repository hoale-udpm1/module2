package Car;

import com.sun.tools.javac.Main;

import java.util.Random;

public class Car implements Runnable {
private String name;
public Car(String name){
    this.name = name;
}
    @Override
    public void run() {
    int runDistance = 0;
    long startTime = System.currentTimeMillis();
    while (runDistance < Main.DISTANCE){
        int speed = (new Random()).nextInt(20);
        runDistance += speed;
        String log = "|";
        int percentTravel = (runDistance * 100) / DISTANCE;
        for (int i = 0, i < DISTANCE)
    }

    }
}
