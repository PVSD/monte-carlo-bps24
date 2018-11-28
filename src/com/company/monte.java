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
        x = Math.random()*(h)*2 + (h+r-(2*h));
        return x;
    }

    public double nextRainDrop_y()
    {
        y = Math.random()*(k)*2 + (k+r)-(2*h);
        return y;
    }

    public boolean insideCircle(double xp, double yp)
    {
        if (((xp-h)*(xp-h) + (yp-k)*(yp-k)) <= (r*r))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
