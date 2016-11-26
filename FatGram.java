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
public class FatGram {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of calories ");
        int calories= input.nextInt();
        System.out.print("Enter the number of fat grams : ");
        int fat=input.nextInt();
        if(fat>calories)
        {
            System.out.println("Error..");
            System.exit(0);
        }
        int caloriesFat=fat*9;
        int percent = caloriesFat/calories*100;
        if(percent<30)
        {
            System.out.println("Congrats low in fat");
        }else
        {
            System.out.print("Not low in fat");
        }
    }
}
