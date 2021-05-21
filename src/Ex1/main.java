/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class main {
    public static void main(String[] args) {
        System.out.print("[1] Checking [2] Saving : ");
        Scanner ChoiceInput = new Scanner(System.in);
        int Choice = ChoiceInput.nextInt();
        
        if(Choice == 1) //Checking
        {
            System.out.println("Checking");
            System.out.print("Overdraft Limit : ");
            Scanner ODinput = new Scanner(System.in);
            double OD = ODinput.nextDouble();
            System.out.print("Balance is : ");
            Scanner BLinput = new Scanner(System.in);
            double BL = BLinput.nextDouble();
            System.out.print("Withdraw is : ");
            Scanner WDinput = new Scanner(System.in);
            double WD = WDinput.nextDouble();
            CheckingAccount C1 = new CheckingAccount(OD,BL,WD);
//            if(BL != C1.CheckingWithdrawn())
//            {
//            System.out.println("Balance is "+C1.CheckingWithdrawn());
//            System.out.println("This account was created => "+C1.toString());
//            } 
            System.out.println(C1.CheckingWithdrawn());
        } else if(Choice == 2) //Saving
        {
            System.out.println("Saving");
            System.out.print("Balance is : ");
            Scanner BLinput = new Scanner(System.in);
            double BL = BLinput.nextDouble();
            System.out.print("Withdraw is : ");
            Scanner WDinput = new Scanner(System.in);
            double WD = WDinput.nextDouble();
            System.out.print("Annual Interest Rate is : ");
            Scanner AIRinput = new Scanner(System.in);
            double AIR = AIRinput.nextDouble();
            SavingAccount S1 = new SavingAccount(BL,WD,AIR);
            if(BL != S1.SavingWithdrawn())
            {
            System.out.println("Balance is "+S1.SavingWithdrawn());
            System.out.println("Mountly Interest is "+S1.monthlyInterestRate()*S1.SavingWithdrawn());
            System.out.println("This account was created"+S1.toString());
            } 
        } else System.out.println("3! E R R O R !");
    }
   
}
