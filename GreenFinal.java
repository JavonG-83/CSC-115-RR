//Javon Green
// //5.12.2026
//CIS-115 Final
//Develop a program that will allow a clerk to enter prices for items purchased and generate the subtotal, tax and total. 

import java.util.Scanner;
public class GreenFinal{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        displayInfo();
        System.out.println();
        int itemCount = getItemCount(input);
        System.out.println();
        double subtotal = getItemPrices(input, itemCount);
        double taxDue = getSalesTax(subtotal);
        double totalOwed = getTotalOwed(subtotal, taxDue);
        System.out.println();
        displayValues(itemCount, subtotal, taxDue, totalOwed);
        input.close();
    }
    public static void displayInfo(){
        System.out.println("Javon Green");
        System.out.println("2026 Spring CIS 115 Final Exam"); //Updated the date for this program (Please don't tax me over this)
        System.out.println("I did not use AI to help me with this final");
        System.out.println("I used only concepts covered in class");
    }
    public static int getItemCount(Scanner input){
        System.out.print("How many items do you plan to purchase? ");
        return input.nextInt();
    }
    public static double getItemPrices(Scanner input, int count){
        //Use a for loop to get the total cost, and a while loop to validate inputs
        double subtotal = 0;  //Our cumulutive sum of all the items
        double itemPrice = 0;  //keeps track of a single item, and adds it to the total
        for (int i = 0; i < count; i++){    //this helps tally the total costs for display
            while (true){    //This prevents any invalid inputs.
                System.out.print("Enter item #"+(i+1)+": ");
                itemPrice = input.nextDouble();
                if (itemPrice < 0){
                    System.out.println("Item price cannot be less than zero. Please try again");
                }
                else{
                    break;  //Stops the while 
                }
*/
            }
            subtotal += itemPrice;
        }
        return subtotal;
    }
    public static double getSalesTax(double subtotal){
        final double SALES_TAX = 0.07;
        return subtotal * SALES_TAX;
    }
    public static double getTotalOwed(double subtotal, double taxDue){
        return subtotal + taxDue;
    }
    public static void displayValues(int itemCount, double subtotal, double taxDue, double totalOwed){
        System.out.println("Number of items: "+itemCount);
        System.out.println("subtotal: "+subtotal);
        System.out.println("Taxes Due: "+taxDue);
        System.out.println("Total Owed: "+totalOwed);
    }
}

/*
Problem Description: Cameron Stores needs you to develop a program that will allow a
clerk to enter prices for items purchased and generate the subtotal, tax and total. The
program should use methods and functions to pass variables between methods and
functions. At the end of the program, the program should display the number of items
purchased, subtotal, sales tax and total amount owed. Below are the specifications
needed for each method and function to be used in the program.
General Directions:
Your main method will call all methods and functions
While loop to run program again if user wishes are not required
Create your Scanner variable in the main method to pass to each function
Use method names given
Use descriptive variables
Do not use AI to solve the problem (grade will be 1)
Do not use concepts not covered in class which includes the following (grade will be 1):
Arrays and Lists
Global variables
Try/Except
While True
Use the data given to test your program
--------
6. Create a method called displayValues() that will be called from the main() method.
Pass all arguments needed. The method will display the following:
Number of Items:
subtotal:
Tax Due:
Total Owed:
Use the following data to check your program. If value is negative, when
prompted to re-enter cost, make the value positive. For example, I enter -9.89 then
I would re-enter 9.89. I completed Sample #1 data for you.
Sample
#
Items # Item
Prices
Total Item
Cost
Sales Tax Total
Owed
1 5 12.35
18.34
-1.89
5.55
99.99
138.12
(Assumes
-1.89 is
really
1.89)
9.67 147.79
2 4 43.23
69.58
-72.13
88.23
272.17
(Assumes
-72.13 is
really
71.13)
3 3 70.18
10.28
22.13
102.59
4 1 -5.89
Reenter
as 5.89
5.89
Sample #1 Output:
Deliverables:
1. Submit java file named lastnameFinal
2. Screenshots of all four data samples in Word file
Grading Criteria:
1. Code 70 points
a. Variables named correctly 5 points
b. For Loop used 15 points
c. Data Validation 10 points
d. Functions 20 points
e. Methods 10 points
f. Miscellaneous 10 points
2. Screen shots 20 points
3. File Named correctly 10 points
*/