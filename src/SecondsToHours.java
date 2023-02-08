/**
 * @Class: SecondsToHours
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 7, 2023
 * This program will convert a given total number of seconds into hours, minutes, and seconds.
 * In this program, I will declare variable: numb1, numb2, numb3.
 */

import java.util.Scanner;
public class SecondsToHours {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for total seconds: ");
        int seconds = input.nextInt();
        int numb1 = seconds % 60;
        int numb2 = seconds / 60;
        int numb3 = numb2 % 60;
        numb2 = numb2 / 60;

       System.out.println("If the total hours is " +seconds + "," + "it is " +numb2 + " hours," +numb3 + " minutes " + "and " +numb1 + " seconds");

    }
}
