package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int cirCount = 0;
        int sqrCount = 0;
        double estimate;

        monte Obj = new monte(2.0,2.0,1.0);

        for (int i = 0; i < 10000000; i++)
        {
            sqrCount ++;
            if (Obj.insideCircle(Obj.nextRainDrop_x(),Obj.nextRainDrop_y()))
            {
                cirCount++;
            }
        }

        estimate = (((double)(cirCount)) * (4))/(sqrCount);


        System.out.println("Pi is approximately: " + estimate);

    }
}
