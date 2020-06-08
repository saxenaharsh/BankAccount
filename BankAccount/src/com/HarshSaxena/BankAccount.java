package com.HarshSaxena;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String CustomerName;
    private String email;
    private String phoneNumber;


    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made.  New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " is available.  Withdrawal not processed ");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processsed.  Remaining Balance " + this.balance);
        }
    }


    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCustomerName(String customerName){
        this.CustomerName = customerName;
    }
    public String getCustomerName(){
        return this.CustomerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

}
