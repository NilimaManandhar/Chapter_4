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
public class BankCharges {
    public static void main(String[] args)
    {
        double initialCharge=10;
        double extraCharge=15;
        double checks;
        double charge=0;
        double userMoney;
        
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the account balace : ");
        userMoney=input.nextDouble();
        charge = charge+initialCharge; //add $10 fee
        System.out.print("Enter the checks :"); //???
        checks= input.nextDouble();
        
        if(checks<20)
        {
            charge=charge+checks*.10;
        }else if(checks>=20 && checks<=39)
        {
            charge=charge+checks*.08;
        }else if(checks>=40 && checks<=59)
        {
            charge=charge+checks*0.06;
        }else
        {
            charge=charge+checks*.04;
        }
            
        if(userMoney<400)
        {
            charge=charge+extraCharge;
        }
            
        System.out.println("You have to pay $"+ charge);
        
        
    }
    
}
