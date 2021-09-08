package org.example;
import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 first_name last_name
 */

public class App 
{
    public static void main( String[] args )
    {
        // scanner / year
        Scanner input = new Scanner(System.in);
        Calendar year = Calendar.getInstance();

        // current age
        System.out.print("What is your current age? ");
        String curAge = input.nextLine();
        int curNum = Integer.parseInt(curAge);

        // take number two
        System.out.print("At what age would you like to retire? ");
        String retAge = input.nextLine();
        int retNum = Integer.parseInt(retAge);

        // print time left
        System.out.print("You have " + (retNum - curNum) + " years left until you can retire. \n");

        // print years
        System.out.println("It's " + year.get(Calendar.YEAR) + ", so you can retire in " + (year.get(Calendar.YEAR) + (retNum - curNum)) + ".");

    }
}
