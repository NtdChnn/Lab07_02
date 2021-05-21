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
public class Account {
    double Balance;
    double withdraw;
    private Date dateCreated;

    public Account() {
    }

    public Account(double Balance, double withdraw) {
        this.Balance = Balance;
        this.withdraw = withdraw;
        dateCreated = new Date();
    }

    double Withdraw()
    {
        Balance = Balance - withdraw;
        return Balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    @Override
    public String toString() {
        return "Account{" + "dateCreated=" + dateCreated + '}';
    }
}
