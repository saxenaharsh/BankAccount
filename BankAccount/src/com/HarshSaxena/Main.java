package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here



           BankAccount harshsaccount = new BankAccount();//(12345, 0.00, "Harsh Saxena", "harsh.saxena@gmail.com",
               // "7798169988");



        harshsaccount.withdrawal(100.0);
        harshsaccount.deposit(50.0);
        harshsaccount.withdrawal(100.0);
        harshsaccount.deposit(51);
        harshsaccount.withdrawal(100.0);

        BankAccount lamusAccount = new BankAccount("Lamu", "lamu@gmail.com", "12335");
        System.out.println(lamusAccount.getAccountNumber() + " name " + lamusAccount.getCustomerName());















    }

}
