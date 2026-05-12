/*
Javon Green
5.7.2026
CSC.115
Debug the following programn; leave useful comments to note what went wrong and how to fix it
*/

import java.util.Scanner;

/**
* M7NeedtoDebug.java
* Debug the java file to make sure it will execute correctly
* The program asks the user for two values (a and b where c is the third value)
for a right triangle to get the area and hypotenuse
* The program will use methods and functions
* The program will ask whether it can run again
* You will need to debug the functions and methods
* use the value 5 for Side A
* Use the value 12 for side B
* Thus, 13 should be value you will receive for hypotenuse
*/
public class M7CW2_Green
{
public static void main(String[] args) //There was a semicolon here; removed it
{
runProgram(); //All calls to the functions/methods should come from runProgram(), not runMenu()
}

public static void runProgram()
{
Scanner in = new Scanner(System.in); // Fixed the scanner 'Scaner k = new Sinner();
//Method names didn't match; displayinfo had alot of untapped potential

String name = getName(in);
System.out.println("Hello "+name);
String keep_going = "yes";   //keep_going was declared as 'no'; replaced wiht 'yes' so it can loop

while(keep_going.equalsIgnoreCase("yes"))
{ //incorrect variables such as 'sideA'
int sideA = getSideA(in);
int sideB = getSideB(in);
int area = calArea(sideA, sideB); //was declared as an integer, but the method returns a double
double hypotenuse = calHypotenuse(sideA, sideB);
displayValues(sideA, sideB, area, hypotenuse); //called the wrong method 'displayValue'
System.out.println();
System.out.println();
//never prompted the user to repeat the program
System.out.println("Do you want to repeat the program?: type yes or no");
in.nextLine();
keep_going = in.nextLine();
}
in.close();
System.out.println("Program has terminated!");
}

public static String getName(Scanner in)
{ // Never took an input value to display a proper name
// I'm remodeling it after 'getSideA', prompting for a name, and returning a String. which will be used later.
System.out.println();
System.out.print("Your name: ");
String name = in.nextLine();
System.out.println();
return name;

}
public static int getSideA(Scanner in) //Returned a string instead of a integer
{
System.out.print("Enter side A of the right triangle: ");
int sideA = in.nextInt();
return sideA;
}
public static int getSideB(Scanner in ) //returned a double instead of an integer
{
System.out.print("Enter side B of the right triangle: ");
int sideB = in.nextInt(); //misspelled as 'nextDoubele'
return sideB;
}
public static int calArea( int a, int b ) //returned a string and had a semicolon
{
return (a * b) / 2; //The formula was actually incorrect, mutiplying 2 isntead of dividing
}
public static double calHypotenuse( double a, double b )
{
// hypotenuse must be double in the Math.hypot() function so values are received as double not integers
// this function has no errors
return Math.hypot(a, b);
}
public static void displayValues(int sideA, int sideB, int area, double hypotenuse)
//should utilize void because it doesn't return values
//these lines used commas instead of plus symbols, and lacked semicolons
{
System.out.println();
System.out.println("Side A is " + sideA);
System.out.println("Side B is " + sideB);
System.out.println("Area is " + area);
System.out.println("Hypotenuse is " + hypotenuse);
System.out.println();
}
}