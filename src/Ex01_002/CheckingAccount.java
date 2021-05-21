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
public class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount() {
    }

    public CheckingAccount(double overdraftLimit, double balance, double withdraw, double deposite) {
        super(balance, withdraw, deposite);
        this.overdraftLimit = overdraftLimit;
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

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCheckingAccount{" + "\noverdraftLimit=" + overdraftLimit + '}';
    }
}
