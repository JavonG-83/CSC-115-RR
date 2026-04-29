/*
Javon Green
CSC-115 Intro to programming and logic
Apr.26.2026
Design a programn that calculate monthly commisions for widget sales
*/

import java.util.Scanner;
public class M6HW3_Green {public static void main(String args[]){
Scanner scc = new Scanner(System.in); //Sales Commission Calculator
    String name;
    int sold, returned, net;
    double commission;
        //Prompt users for their name, widgets sold and widgets returned
    System.out.print("Enter name: ");
    name = scc.nextLine();
    System.out.print("Enter widgets sold");
    sold = scc.nextInt();
    System.out.print("Enter widgets returned: ");
    returned = scc.nextInt();
        //Calculate net widgets sold and commission earned
    net = sold - returned;
    commission = (net*0.1)+500;
        //Dispaly Results
    System.out.println("Name: "+name);
    System.out.println("Net widgets sold"+net);
    System.out.println("Total commision earned"+commission);
scc.close();
}}