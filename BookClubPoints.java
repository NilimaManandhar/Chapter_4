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
public class BookClubPoints {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int points=0;
        System.out.print("Enter the number of books purchased : ");
        int books = input.nextInt();
        if(books<=0)
        {
            points=0;
        }
        else if(books==5)
        {
            points=5;
        }else if(books==2)
        {
            points=10;
        }else if(books==3){points=30;}
        else points=60;
        System.out.println("You are awarded "+ points + " points");
    }
    
}
