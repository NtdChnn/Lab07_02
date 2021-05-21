package Ex2;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class Account {
    private int id;
    private String name;
    private double  balance,annualInterestRate;
    private Date dateCreated;
    
    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
 
    Account(int id,String name ,double  annualInterestRate){
        this.id = id;
        this.name = name;
        this.annualInterestRate = annualInterestRate;
        balance = 0;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void withdraw(double withdraw){
        if(withdraw <= balance && withdraw > 0)
        {
            balance = balance-withdraw;
            System.out.println("Balance : " + balance);
        } else System.out.println("! Error withdraw !");
    }
    
    public void deposit(double deposit){
        if(deposit > 0)
        {
            balance = balance+deposit;
            System.out.println("Balance : " + balance);
        }else System.out.println("! Error deposit !");
    } 
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }    
    public double getMonthlyInterest(){
        return balance * annualInterestRate/12 /100;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate + ", dateCreated=" + dateCreated + '}';
    }
    
    
}
