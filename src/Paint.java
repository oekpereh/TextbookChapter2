/**
 * @Class: Paint
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 7, 2023
 * This program will calculate the gallons and quarts of paint needed to paint the room.
 * In this program, I will declare variables: length, width, height, numbOfWindows, numbOfDoors,
 * totalArea, quarts, and gallons.
 */

import java.util.Scanner;
public class Paint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Length of the room is: ");
        int length = input.nextInt();
        System.out.println("Width of the room is: ");
        int width = input.nextInt();
        System.out.println("Height of the room is: ");
        int height = input.nextInt();
        System.out.println("Number of windows is: ");
        int numb_of_windows = input.nextInt();
        System.out.println("Number of doors is: ");
        int numb_of_doors = input.nextInt();

        double total_area = (length * width * height) * 2 + length * width - numb_of_windows * 15 - numb_of_doors * 21;
        System.out.println("Area is: " + total_area);
        double quarts = 4 * total_area / 350.0;
        System.out.println(quarts + " quarts needed");

        int gallons = 1;
        System.out.println(gallons + " gallons and " + quarts + " quarts of paint is needed to paint the room.");



    }
}
