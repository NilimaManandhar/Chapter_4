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
public class BodyMassIndex {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your weight in lbs: ");
        double weight=input.nextDouble();
        System.out.print("Enter your height in inches : ");
        double height=input.nextDouble();
        double bmi = weight*703/(height*height);
        if(bmi>=18.5 && bmi<=25)
        {
            System.out.println("You are normal");
        }else if(bmi<=18.5)
        {
            System.out.println("Underweight");
        }else if(bmi>=25)
        {
            System.out.println("FAT");
        }
    }
    
}
