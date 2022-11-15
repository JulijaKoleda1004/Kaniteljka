package Lekture3;

public class SignComporator {
    public String compare(int number) {
        if (number  < 0 ) {
            return "number is positive";
        } else if (number > 0) {
            return "number is negative";
        } else {
            return "number is 0";
        }
    }
}
