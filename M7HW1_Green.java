// Javon Green
// M7HW1
// 5.10.2026
// Revise a program that takes a salesperson's name, widget sales & widgets returned, and generates their commission and salary for the month.
// This time, separate the project into different methods, and have all of them be executed from a 'runProgram' method
// Make sure to leave helpful comments

import java.util.Scanner;

public class M7HW1_Green {
    public static void main(String[] args) {
    runProgram();
    }
    public static void runProgram(){
    final double BASE_SALARY = 2000;
    final double WIDGET_PRICE = 4.79;
    String keep_going = "yes";
    Scanner input = new Scanner(System.in);
    do{
    System.out.println("=-=-=Widget Sales=-=-=");
    System.out.print("Please enter your name: ");
    String name = input.nextLine(); //Get the user's name for the 'displayInfo' method
    displayInfo(name); //Display the name and 'problem descriptions' (I'm assuming that's the program's purpose)
    int widgetsSold = getSales(input); //How many widgets were sold in total
    int widgetsReturned = getReturns(input); //How many widgets were returned in total
    int netWidgetsSold = calWidSold(widgetsSold, widgetsReturned); //How many widgets were sold without being returned
    double widgetsSalesAmount = calWidSalesAmt(netWidgetsSold, WIDGET_PRICE); //Determines the total widget sales based on the net widgets sold.
    double commAmount = calComm(netWidgetsSold, widgetsSalesAmount); // How much the user will earn based on the widgets they sold and their overall value
    double monthlySalary = calSalary(commAmount, BASE_SALARY); //How much the user will earn, taking into account their commsission and baseSalary of $2000
    displayValues(name, widgetsSold, widgetsReturned, netWidgetsSold, widgetsSalesAmount, commAmount, monthlySalary); //Display the results
    System.out.println("------------------------------------------");
    //Prompt the user to repeat or end the program
    System.out.println("Do you want to run the program again? Type 'Yes' or 'No'");
    input.nextLine(); //Clears the buffer
    keep_going = input.nextLine();
    }while(keep_going.equalsIgnoreCase("yes"));
    input.close();
    System.out.println("Program terminated. Have a good day!");
    }

    public static void displayInfo(String name){
        System.out.println("Hello "+name+"!");
        System.out.println("This program will help calculate a commission and salary for the month, based on the net amount of widgets sold.");
    }
    public static int getSales(Scanner input){ //Gets the amount of widgets sold over the course of 4 weeks
        int runningTotal = 0;
        for (int i = 0; i < 4;){
            System.out.print("Enter your widgets sold for Week #"+(i+1)+": ");
            int widgetsSold = input.nextInt();
            if (widgetsSold >= 0){
                runningTotal += widgetsSold;
                i++; //I moved the increment increase into the function. Now, the method won't accept negative values for widgets sold
            }
            else{
                System.out.println("Invalid please try again");
            }
        }
        return runningTotal;

    }
    public static int getReturns(Scanner input){  //Gets the amount of widgets sold over the course of 4 weeks
        int runningTotal = 0;
        for (int i = 0; i < 4;){
            System.out.print("Enter your widgets returned for Week #"+(i+1)+": ");
            int widgetsReturned = input.nextInt();
            if (widgetsReturned >= 0){
                runningTotal += widgetsReturned;
                i++; //Same idea as getSales()
            }
            else{
                System.out.println("Invalid please try again");
            }
        }
        return runningTotal;

    }
    public static int calWidSold(int widgetsSold, int widgetsReturned){  //Returns the net value of widgets sold by subtracting (sold - returned)
        int netValue = widgetsSold - widgetsReturned;
        return netValue;
    }
    public static double calWidSalesAmt (double netWidgetsSold, double widgetPrice){ //Determines the total value of the widgets sold (count * cost) 
        double widgetsSalesAmount = netWidgetsSold * widgetPrice;
        return widgetsSalesAmount;
    }
    public static double calComm(int netWidgetsSold, double widgetsSalesAmount){ //Determines how much the user will earn from their commission
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
        double commAmount = commRate * widgetsSalesAmount;
        return commAmount;
    }
    public static double calSalary(double commAmount, double baseSalary){ //Returns the total monthly salary, including both the commission and base salary of $2000
        double monthlySalary = commAmount + baseSalary;
        return monthlySalary;
    }
    public static void displayValues(String name, int widgetsSold, int widgetsReturned, double netWidgetsSold, double widgetsSalesAmount, double commAmount, double monthlySalary){
        System.out.println("Sales Person: "+name);
        System.out.println("Widgets Sold: "+widgetsSold);
        System.out.println("Widgets Returned: "+widgetsReturned);
        System.out.println("Net Widgets Sold: "+netWidgetsSold);
        System.out.printf("Widget Sales Amount: $%.2f%n", widgetsSalesAmount); //finally figure out how to work these
        System.out.printf("Commission Amount: $%.2f%n", commAmount);
        System.out.printf("Monthly Salary: $%.2f%n", monthlySalary);
    }
}