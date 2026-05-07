/*
Javon Green
5.7.2026
CSC-115
Find and correct everything in the programn; leave comments where things went wrong (this is really hard to look at)
Some of the comments "bled" into the code, so 
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

public class M7NeedtoDebug
{
public static void main(String[] args);{ //There was a semicolon here; deleted it
runMenu();
}
public static void runMenu(){
Scaner k = new Sinner(); // fix this scanner variable and pass its variable to other methods
String keep_going = "yes";   //variable was set to 'no', but the while loop will only run if the varible is 'yes'
while(keep_going.equalsIgnoreCase("yes"))
{
displayInfo();
// all calls to your function/methods should come from runProgram() method only
int SideA = getSideA(in);
int SideB = getSideB(in);
int area = calArea(sideA,sideB);
double hyptoenuse = calHypotenuse(sideA,sideB);
displayValue(sideA, sideB, area, hypotenuse);
System.out.println();
System.out.println();
}
k.close(); //closed the incorrect scanner 'in.close'
System.out.println("Program has terminated!");
}

public static void display(){
System.out.println();
System.out.println("Your name");
System.out.println();
}
public static String getSideA(Scanner in ){
System.out.print("Enter side A of the right triangle: ");
int sideA = in.nextLine();
return sideA;
}
public static double getSideB(Scanner in ){
System.out.print("Enter side B of the right triangle: ");
String sideB = in.nextDoubele();
return sideB;
}
public static String calArea( int a, int b ){   //There was a semicolon here; removed it
return (a*b)*2;
}

public static double calHypotenuse( double a, double b ){
// hypotenuse must be double in the Math.hypot() function so values are received as double not integers; this function has no errors
return Math.hypot(a, b);
}
public static int displayValues(sideA,sideB,area,hypotenuse){
//used comas instead of addition symbols; forgot to use semicolons at the end of lines
System.out.println();
System.out.println("Side A is " + sideA);   
System.out.println("Side B is " + sideB);
System.out.println("Area is " + area);
System.out.println("Hypotenuse is " + hypotenuse);
System.out.println();
}
}