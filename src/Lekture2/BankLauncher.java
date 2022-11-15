package Lekture2;

import Lekture2.Bank;

public class BankLauncher {
    public static void main(String[] args) {
      Bank bankVariable = new Bank();
      bankVariable.checkBalance();
      bankVariable.deposit(1000);
      bankVariable.checkBalance();
      bankVariable.withdraw(1000);
      bankVariable.checkBalance();

    }
}
