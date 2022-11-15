package Lekture3;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        int soundLevel = 10;
        if (soundLevel<=39){
            System.out.println("dsfsdfa");
        } else if (soundLevel>= 40 && soundLevel <= 69) {
            System.out.println("SSSS");
        } else if (soundLevel>= 70 && soundLevel<= 99){
            System.out.println("SSSSS");
    } else if (soundLevel>= 100 && soundLevel<= 129){
            System.out.println("DDDDD");
        } else {
            System.out.println("GGGG");
        }

    }
}
