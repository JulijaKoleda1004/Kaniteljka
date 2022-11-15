package Lekture2;

import Lekture2.Calculator;

public class CalculatorLauncher {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Calculator calculator = new Calculator();
        int sum = calculator.sum(a,b);
        System.out.println("Sum is " + sum);
        int subst = calculator.subst(a,b);
        System.out.println("Substraction is " + subst);
        int multi = calculator.multiply(sum ,subst);
        System.out.println("Multiply is " + multi);
        System.out.println("Division is " + calculator.division(a, b));
    }
}
