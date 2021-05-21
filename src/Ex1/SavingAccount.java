/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.Date;

/**
 *
 * @author notda
 */
public class SavingAccount extends Account {
    double savingBalance;
    double annualInterestRate;
    Date dateCreated;

    public SavingAccount() {
    }

    public SavingAccount(double Balance, double withdraw,double annualInterestRate) {
        super(Balance, withdraw);
        this.annualInterestRate = annualInterestRate;
        dateCreated = super.getDateCreated();
    }

    double SavingWithdrawn()
    {
        if(super.Withdraw() > 0)
        {
            savingBalance = super.Withdraw();
            
        } else System.out.println("2! E R R O R !");
        return savingBalance;
    }
    
    double monthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + "dateCreated=" + dateCreated + '}';
    }
    
}
