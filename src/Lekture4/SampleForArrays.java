package Lekture4;

import java.util.Arrays;

public class SampleForArrays {
    public static void main(String[] args) {
        int[] leapYears1 = new int[3];
        leapYears1[0] = 2016;
        //       leapYears1[1] = 2017;
        leapYears1[2] = 2018;
        System.out.println(Arrays.toString(leapYears1));

        int[] leapYears2 = {2020, 2021, 2022};
        System.out.println(Arrays.toString(leapYears2));

        String[] nameOfPhones = new String[10];
        nameOfPhones[0] = "3310";
        nameOfPhones[1] = "3210";
        nameOfPhones[2] = "3310";
        nameOfPhones[3] = "3410";
        nameOfPhones[4] = "3510";
        nameOfPhones[5] = "3110";

        for (int i = 0; i < nameOfPhones.length; i++) {

                System.out.println("Name of phone for element " + i + " is equal to " + nameOfPhones[i]);
            }

    }
 //
        }

