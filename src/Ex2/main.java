/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author notda
 */
public class main {
    public static void main(String[] args) {
        double balance;
        
    //Auto filled//
        Account A1 = new Account(1122,"George",1.65);
        balance = 1000;
        ArrayList<Transaction> Tr = new ArrayList<>();
        
        System.out.println("Name : "+ A1.getName()+"\nAccount ID : "+A1.getId()+"\nAnnual interest rate : "+A1.getAnnualInterestRate());
        System.out.println("Date\t\t\t\tType\tAmount\tBalance");
        Tr.add(new Transaction(30,balance,'D'));
        balance = Tr.get(0).getLeftBalanceShow();
        Tr.add(new Transaction(40,balance,'D'));
        balance = Tr.get(1).getLeftBalanceShow();
        Tr.add(new Transaction(50,balance,'D'));
        balance = Tr.get(2).getLeftBalanceShow();
        Tr.add(new Transaction(5,balance,'W'));
        balance = Tr.get(3).getLeftBalanceShow();
        Tr.add(new Transaction(4,balance,'W'));
        balance = Tr.get(4).getLeftBalanceShow();
        Tr.add(new Transaction(2,balance,'W'));
        balance = Tr.get(5).getLeftBalanceShow();
    
    //Manual filled//
//        System.out.print("Name : ");
//        Scanner name_ = new Scanner(System.in);
//        String name = name_.nextLine();
//        System.out.print("ID : ");
//        Scanner ID_ = new Scanner(System.in);
//        int ID = ID_.nextInt();
//        System.out.print("Annual interest rate : ");
//        Scanner rate_ = new Scanner(System.in);
//        double rate = rate_.nextDouble();
//        Account A2 = new Account(ID,name,rate);
//        System.out.print("Balance : ");
//        Scanner balance_ = new Scanner(System.in);
//        balance = balance_.nextDouble();
//        
//        ArrayList<Transaction> Tr1 = new ArrayList<>();
//        for(int i  = 0 ; i< 6; i++)
//        {
//            System.out.print("Withdraw[W] Deposit[D] : ");
//            Scanner type_ = new Scanner(System.in);
//            char type = type_.nextLine().charAt(0);
//            System.out.print("Amount : ");
//            Scanner amount_ = new Scanner(System.in);
//            double amount = amount_.nextDouble();
//            Tr1.add(new Transaction(amount,balance,type));
//            balance = Tr1.get(i).getLeftBalance();
//        }
//        
//        System.out.println("Name : "+ A2.getName()+"\nAccount ID : "+A2.getId()+"\nAnnual interest rate : "+A2.getAnnualInterestRate());
//        System.out.println("Date\t\t\t\tType\tAmount\tBalance");
//        for(int i = 0 ; i < 6 ; i++)
//        {
//            Tr1.get(i).Show();
//        }
    }
}
