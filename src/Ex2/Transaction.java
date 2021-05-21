/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.Date;

/**
 *
 * @author notda
 */
public class Transaction {
    Date date;
    double amount;
    double balance;
    char type;

    public Transaction() {
        amount = 0;
        balance = 0;
        date = new Date();
    }

    public Transaction(double amount, double balance, char type) {
        this.amount = amount;
        this.balance = balance;
        this.type = type;
        date = new Date();
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public char getType() {
        return type;
    }
    public void setType(char type) {
        this.type = type;
    }
    public Date getDate() {
        return date;
    }
    
    public double getLeftBalanceShow (){
        if(type == 'W' && balance >= amount && amount > 0)
        {
            balance -= amount;
            System.out.println(date+"\t"+type+"\t"+amount+"\t"+balance);
        } else if(type == 'D' && amount > 0)
        {
            balance += amount;
            System.out.println(date+"\t"+type+"\t"+amount+"\t"+balance);
        } else System.out.println("! E R R O R !");
        return balance;
    }
    
    public double getLeftBalance (){
        if(type == 'W' && balance >= amount && amount > 0)
        {
            balance -= amount;
        } else if(type == 'D' && amount > 0)
        {
            balance += amount;
        } else System.out.println("! E R R O R !");
        return balance;
    }
    
    public void Show(){
        if(type == 'W' && balance >= amount && amount > 0)
        {
            System.out.println(date+"\t"+type+"\t"+amount+"\t"+balance);
        } else if(type == 'D' && amount > 0)
        {
            System.out.println(date+"\t"+type+"\t"+amount+"\t"+balance);
        } else System.out.println("! E R R O R !");
    }
    
    @Override
    public String toString() {
        return "Transaction{" + "date=" + date + ", amount=" + amount + ", balance=" + balance + ", type=" + type + '}';
    }
}
