/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.Synchronization;

/**
 *
 * @author jaydev
 */

class Account{
    public int balance;
    public int accountNo;
    
    void displayBalance(){
        System.out.println("Acc No is: " + accountNo + ", Balance is : " + balance);
    }
    
    synchronized void deposit(int amount){
        balance += amount;
        System.out.println("amount deposited: " + amount);
        displayBalance();
    }
    
    synchronized void withdraw(int amount){
        balance -= amount;
        System.out.println("amount withdraw: " + amount);
        displayBalance();
    }
}

class TranDeposit implements Runnable{
    int amount;
    Account accx;

    public TranDeposit(Account x, int amount) {
        accx = x;
        this.amount = amount;
        new Thread(this).start();
    }
    
    @Override
    public void run() {
        accx.deposit(amount);
    }
}

class TranWithdraw implements Runnable{
    int amount;
    Account accy;

    public TranWithdraw(Account y, int amount) {
        accy = y;
        this.amount = amount;
        new Thread(this).start();
    }
    
    @Override
    public void run() {
        accy.withdraw(amount);
    }
}

public class Banking {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.balance = 1000;
        obj.accountNo = 11;
        
        TranDeposit t1 = new TranDeposit(obj, 500);
        TranWithdraw t2 = new TranWithdraw(obj, 300);
    }
}
