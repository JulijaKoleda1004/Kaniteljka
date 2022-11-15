package Lekture2;

public class Bank {

    private int bankBalance = 1000;

    public void deposit(int amount) {
        if (amount >= 10000) {
            System.out.println("Please consult VID or your tax manager");
        } else {
        bankBalance = bankBalance + amount;
        System.out.println("You have deposited " + amount + " euros");
        }
    }

    public void withdraw(int amount) {
        if (bankBalance - amount < 0){
            System.out.println("You can not afford this. ZERO CASH");
        } else if (amount > 700) {
            System.out.println("You can not take out more than 700 euro");
        } else {
        bankBalance = bankBalance - amount;
        System.out.println("You have " + amount + " euros on your bank account");
        }
    }

    public void checkBalance() {
        System.out.println("You have " + bankBalance + " euros on your bank account");
    }
}
