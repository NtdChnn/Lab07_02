/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_002;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class main {
    public static void main(String[] args) {
        System.out.print("[1] Checking [2] Saving : ");
        Scanner choiceInput = new Scanner(System.in);
        int choice = choiceInput.nextInt();
        
        if(choice == 1) //Checking
        {
            System.out.println("Checking");
            System.out.print("Overdraft limit : ");
            Scanner ODinput = new Scanner(System.in);
            double OD = ODinput.nextDouble();
            System.out.print("Balance : ");
            Scanner BLinput = new Scanner(System.in);
            double BL = BLinput.nextDouble();       
            System.out.print("[1] Deposit [2] Withdraw : ");
            Scanner ChoiceInput = new Scanner(System.in);
            int Choice = ChoiceInput.nextInt();
            if(Choice == 1) //Deposit
            {
                System.out.print("Deposit : ");
                Scanner DPinput = new Scanner(System.in);
                double DP = DPinput.nextDouble();
                if(DP < 0)
                {
                    System.out.println("! E R R O R !");
                } else {
                CheckingAccount C1 = new CheckingAccount(OD,BL,0,DP);
                System.out.println(C1.toString());
                System.out.println("Balance is "+ C1.Deposit()); }
            } else if(Choice == 2) //Withdraw
            {
                System.out.print("Withdraw : ");
                Scanner WDinput = new Scanner(System.in);
                double WD = WDinput.nextDouble();
                if(WD < 0)
                {
                    System.out.println("! E R R O R !");
                } else {
                CheckingAccount C1 = new CheckingAccount(OD,BL,WD,0);
                if(C1.Withdraw() + OD >= 0)
                {
                    System.out.println(C1.toString());
                    System.out.println("Balance is "+ C1.Withdraw());
                } else System.out.println("Not enough Overdraft limit"); 
                }
            } else System.out.println("! E R R O R !");
            
            
        } else if(choice == 2) //Saving
        {
            System.out.println("Saving");
            System.out.print("Balance : ");
            Scanner BLinput = new Scanner(System.in);
            double BL = BLinput.nextDouble();
            System.out.println("Annual Interest Rate : ");
            Scanner ALRinput = new Scanner(System.in);
            double ALR = ALRinput.nextDouble(); 
            System.out.print("[1] Deposit [2] Withdraw : ");
            Scanner ChoiceInput = new Scanner(System.in);
            int Choice = ChoiceInput.nextInt();
            if(Choice == 1) //Deposit
            {
                System.out.print("Deposit : ");
                Scanner DPinput = new Scanner(System.in);
                double DP = DPinput.nextDouble();
                if(DP < 0)
                {
                    System.out.println("! E R R O R !");
                } else {
                SavingAccount C1 = new SavingAccount(ALR,BL,0,DP);
                System.out.println(C1.toString());
                System.out.println("Balance is "+ C1.Deposit()); 
                System.out.println("Mountly Interest : "+ C1.mountlyInterestRate()*C1.Deposit());}                
            } else if(Choice == 2) //Withdraw
            {
                System.out.print("Withdraw : ");
                Scanner WDinput = new Scanner(System.in);
                double WD = WDinput.nextDouble();
                if(WD < 0)
                {
                    System.out.println("! E R R O R !");
                } else {
                SavingAccount C1 = new SavingAccount(ALR,BL,WD,0);
                if(C1.Withdraw()>=0)
                {
                    System.out.println(C1.toString());
                    System.out.println("Balance is "+ C1.Withdraw());
                    System.out.println("Mountly Interest : "+ C1.mountlyInterestRate()*C1.Withdraw());
                } else System.out.println("Not enough Overdraft limit"); 
                }
            } else System.out.println("! E R R O R !");
            
        } else System.out.println("! E R R O R !");
    }
}
