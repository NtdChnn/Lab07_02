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
public class CheckingAccount extends Account {
    double checkingOD;
    double checkingingBalance;
    Date dateCreated;

    public CheckingAccount() {
    }

    public CheckingAccount(double checkingOD, double Balance, double withdraw) {
        super(Balance, withdraw);
        this.checkingOD = checkingOD;
        dateCreated = super.getDateCreated();
    }
    
    double CheckingWithdrawn()
    {
        if(super.Withdraw()+checkingOD >= 0)
        {
            checkingingBalance = super.Withdraw();
        } else System.out.println("1! E R R O R !");   
        
        return checkingingBalance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "dateCreated=" + dateCreated + '}';
    }

}
