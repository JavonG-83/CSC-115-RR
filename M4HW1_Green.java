// Javon Green
// M4HW1
// 3.25.2026
// Create a program that takes a salesperson's name, widget sales & widgets returned, and generate their commission and salary for the month. 


import java.util.Scanner;

public class M4HW1_Green {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //DECLARE
    String name;
    int widgetsSold, widgetsReturned, netWidgetsSold;
    double baseSalary = 2000, commAmount, commRate, monthlySalary;

    //INPUT
    System.out.print("Enter your name: ");
    name = input.nextLine();
    System.out.print("Enter your widgets sold: ");
    widgetsSold = input.nextInt();
    System.out.print("Enter your widgets returned: ");
    widgetsReturned = input.nextInt();

    //CALCULATE
    netWidgetsSold = widgetsSold - widgetsReturned;
    final double WSALESAMOUNT = netWidgetsSold * 4.79;
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
    commAmount = commRate * WSALESAMOUNT;
    monthlySalary = commAmount + baseSalary;
    
    //OUTPUT
    System.out.println("Sales Person: "+name);
    System.out.println("Net Widgets Sold: "+netWidgetsSold);
    System.out.println("Widgets Sales Amount: $"+WSALESAMOUNT);
    System.out.println("Commission Amount: $"+commAmount);
    System.out.println("Monthly Salary: $"+monthlySalary); 

    input.close();
}
}