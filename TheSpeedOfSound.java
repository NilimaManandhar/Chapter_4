/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
import java.util.Scanner;
public class SpeedOfSound {
    private int distance;
    
    public void setDistance(int d)
    {
        this.distance=d;
    }
    public int getSpeedAir(int d)
    {
        int speed=d/1100;
        return speed;
    }
    public int getSpeedWater()
    {
        int speed=distance/4900;
        return speed;
    }
    public int getSpeedSteel()
    {
        int speed=distance/16400;
        return speed;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Choose : 1,2 or 3");
        System.out.println("1. Air");
        System.out.println("2.Water");
        System.out.println("3.Steel");
        int choose=input.nextInt();
        System.out.print("Enter the distance : ");
        int distance=input.nextInt();
        SpeedOfSound a=new SpeedOfSound();
        a.setDistance(distance);
        if(choose==1)
        {
            System.out.println(a.getSpeedAir(distance));
        }else if(choose==2)
        {
            System.out.println(a.getSpeedWater());
        }else if(choose==3)
        {
            System.out.println(a.getSpeedWater());
        }
    }
}
