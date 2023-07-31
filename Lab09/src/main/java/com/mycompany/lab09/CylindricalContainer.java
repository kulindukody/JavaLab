/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.lab09;

public class CylindricalContainer extends Container
{
    private double height, radius;
    
    public CylindricalContainer (double h, double r)
    {
        height=h;
        radius=r;
    }
    public double volume()
    {
        return Math.PI * Math.pow(radius, height)*height;
    }
    public void DisplayVolume()
    {
        System.out.println("The volume is: "+Math.pow(radius, height)*height);
    }
}
