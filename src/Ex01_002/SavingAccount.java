/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_002;

/**
 *
 * @author notda
 */
public class SavingAccount extends Account {
    double annaulInterestRate;

    public SavingAccount() {
    }

    public SavingAccount(double annaulInterestRate, double balance, double withdraw, double deposite) {
        super(balance, withdraw, deposite);
        this.annaulInterestRate = annaulInterestRate;
    }

    
    @Override
    double Withdraw()
    {
        double leftbalance;
        leftbalance = super.getBalance()-super.getWithdraw();
        return leftbalance;
    }
    
    @Override
    double Deposit()
    {
        double leftbalance;
        leftbalance = super.getBalance()+super.getDeposit();
        return leftbalance;
    }

    double mountlyInterestRate()
    {
        return annaulInterestRate/12;
    }
    
    public double getAnnaulInterestRate() {
        return annaulInterestRate;
    }
    public void setAnnaulInterestRate(double annaulInterestRate) {
        this.annaulInterestRate = annaulInterestRate;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSavingAccount{" + "\nannaulInterestRate=" + annaulInterestRate + '}';
    }

}
