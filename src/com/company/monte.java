package com.company;

/**
 * Created by bs482 on 11/27/18.
 */
public class monte {
    public double height, width, radius, xpos, ypos;

    public monte (double h, double k, double r)
    {
        height = h;
        width = k;
        radius = r;
    }

    public double nextDropx ()
    {
        xpos = Math.random()*width;
        return xpos;
    }

    public double nextDropy ()
    {
        ypos = Math.random()*height;
        return ypos;
    }

    public boolean isInCircle ()
    {
        if(Math.sqrt((ypos-height)*(ypos-height)+(xpos-width)*(xpos-width))<=radius)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
