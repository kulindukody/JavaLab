/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.bankaccountmain;

public abstract class BankAccount 
{
    int accno;
    double balance;
    
    public BankAccount(int accno, float balance)
    {
        this.accno=accno;
        this.balance=balance;
    }
    public void setaccno(int a)
    {
        accno=a;
    }
    public int getaccno()
    {
        return accno;
    }
    public void setbalance(int b)
    {
        balance=b;
    }
    public double getbalance()
    {
        return balance;
    }
    public abstract double calculateInterest();
}
