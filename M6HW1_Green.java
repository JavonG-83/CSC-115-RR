/*
Javon Green
CSC-115 Intro to programming and logic
Apr.26.2026
Design a programn that calculates gross pay
*/

import java.util.Scanner;
public class M6HW1_Green { public static void main(String args[]) {
    Scanner gpc = new Scanner(System.in); //Gross Pay Calculator

        //Design a programn that calculates gross pay
    String name;
    double rate, hours, gross;
        //Prompt users for their name, pay rate, and hours worked
    System.out.print("Enter your name: ");
    name = gpc.nextLine();
    System.out.print("Enter pay rate: ");
    rate = gpc.nextDouble();
    System.out.print("Enter hours worked");
    hours = gpc.nextDouble();
        //Calculate gross pay
    gross = rate * hours;
        //Display results
    System.out.println("Name: "+name);
    System.out.println("Pay Rate: "+rate);
    System.out.println("Hours Worked: "+hours);
    System.out.println("Gross Pay: "+gross);
    System.out.println("---End of Programn---");

    gpc.close();
}}