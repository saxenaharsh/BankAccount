package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here



        BankAccount harshsaccount = new BankAccount();

        harshsaccount.setAccountNumber(12345);
        harshsaccount.setCustomerName("Harsh");
        harshsaccount.setEmail("harsh.saxena@gmail.com");
        harshsaccount.setPhoneNumber("7798169988");

        harshsaccount.withdrawal(100.0);
        harshsaccount.deposit(50.0);
        harshsaccount.withdrawal(100.0);
        harshsaccount.deposit(51);
        harshsaccount.withdrawal(100.0);















    }

}
