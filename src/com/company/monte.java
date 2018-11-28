package com.company;

import java.util.Random;

/**
 * Created by bs482 on 11/27/18.
 */
public class monte {

    public double h, k, r, x, y;

    public monte(double a, double b, double c)
    {
        h = a;
        k = b;
        r = c;
    }

    public double nextRainDrop_x()
    {
        x = Math.random()*(h);
        return x;
    }

    public double nextRainDrop_y()
    {
        y = Math.random()*(k);
        return y;
    }

    public boolean insideCircle(double xp, double yp)
    {
        if (((xp-(h/2))*(xp-(h/2)) + (yp-(k/2))*(yp-(k/2))) <= (r*r))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
