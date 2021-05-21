/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_002;

import java.util.Date;

/**
 *
 * @author notda
 */
public class Account {
    double balance;
    double withdraw;
    double deposit;
    Date dateCreated;

    public Account() {
    }

    public Account(double balance, double withdraw, double deposite) {
        this.balance = balance;
        this.withdraw = withdraw;
        this.deposit = deposite;
        dateCreated = new Date();
    }

    
    
    double Withdraw()
    {
        double leftbalance;
        leftbalance = balance-withdraw;
        return leftbalance;
    }
    
    double Deposit()
    {
        double leftbalance;
        leftbalance = balance+deposit;
        return leftbalance;
    }

    //getter,setter
    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposite) {
        this.deposit = deposite;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getWithdraw() {
        return withdraw;
    }
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + "\ndateCreated=" + dateCreated + '}';
    }
}
