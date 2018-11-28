package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int cirCount = 0;
        int sqrCount = 0;
        int guess;

        monte mcObj = new monte(5.0,3.0,2.0);

        for (int x = 0; x < 100; x++) {
            sqrCount ++;
            if (mcObj.insideCircle(mcObj.nextRainDrop_x(),mcObj.nextRainDrop_y())) {
                cirCount++;
            }
        }

        guess = cirCount * (16)/(sqrCount*16);


        System.out.println(guess + ", " + cirCount + ", " + sqrCount);

    }
}
