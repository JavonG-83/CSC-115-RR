/*
Javon Green
CSC-115 Intro to programming and logic
Apr.26.2026
Design a programn that calculates a monthly water bill
*/

import java.util.Scanner;
public class M6HW2_Green { public static void main (String args[]) {
    Scanner mwb = new Scanner(System.in); //Monthly Water Bill

        //Design a programn that calculates a monthly water bill
    String name;
    double previous, current, usage, charge;
        //Propmt users for their name, and recent water meter readings
    System.out.print("Enter name: ");
    name = mwb.nextLine();
    System.out.print("Enter previous month's meter reading: ");
    previous = mwb.nextDouble();
    System.out.print("Enter current month's meter reading: ");
    current = mwb.nextDouble();
        //Calculate usage and charge
    usage = current - previous;
    charge = (usage*0.2) + 50;
        //Dispaly results
    System.out.println("Name: "+name);
    System.out.println("Previous reading: "+previous);
    System.out.println("Curretn reading: "+current);
    System.out.println("Total charge for month: "+charge);

    mwb.close();
}}