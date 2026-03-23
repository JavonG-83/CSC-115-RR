// Javon Green
// Develop a program that will allow a salesperson to enter their name, widget sales, widgets returned, and generate their commission and salary for the month.

import java.util.Scanner;

public class M4HW1_Green {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //DECLARE
    String name;
    int widgetsSold, widgetsReturned;
    double baseSalary = 2000;

    //INPUT
    System.out.println("Enter your name:");
    name = input.nextLine();
    System.out.println("Enter your widgets sales:");
    widgetsSold = input.nextInt();
    System.out.println("Enter your widgets returned:");
    widgetsReturned = input.nextInt();

    //CALCULATE
    int netWidgetsSold = widgetsSold - widgetsReturned;
    final double wSalesAmount = netWidgetsSold * 4.79;
        //We gotta get that if statment in
    double commRate;
    if (netWidgetsSold<=100){
        commRate=0.1;
    }
    else if (netWidgetsSold<=199){
        commRate=0.15;
    }
    else if (netWidgetsSold<=299){
        commRate=0.2;
    }
    else{
        commRate=0.25;
    }
    double commAmount = commRate * wSalesAmount;
    double monthlySalary = commAmount + baseSalary;
    
    //OUTPUT
    System.out.println("Sales Person: "+name);
    System.out.println("Net Widgets Sold: "+netWidgetsSold);
    System.out.println("Widgets Sales Amount: $"+wSalesAmount);
    System.out.println("Commission Amount: $"+commAmount);
    System.out.println("Monthly Salary: $"+monthlySalary); 

    input.close();
}
}