/*
Javon Green
5.6.2026
CSC-115 (Intro to Programning & Logic)
Practice using Java methods to send inputs and return values
*/

import java.util.Scanner;
public class M7CW1_Assignment_Green{public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int choice;
do {    //Our main menu, for all things main menuy; let the user select 1 of 10 methods, or exit the programn entierly
System.out.println("\n=== Java Function Practice Menu ===");
System.out.println("1. Add 2 Integers");
System.out.println("2. Greetings");
System.out.println("3. Circle's Area");
System.out.println("4. Larger of 2 Numbers");
System.out.println("5. Fahrenheit to Celsius");
System.out.println("6. Show Student Info");
System.out.println("7. Discounted Price");
System.out.println("8. Even or Odd");
System.out.println("9. String Length");
System.out.println("10. Average of 3 Numbers");
System.out.println("0. Exit");
System.out.print("Enter your choice: ");
choice = input.nextInt();
System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
input.nextLine();
switch (choice) {
case 1: //Add 2 Integers
    System.out.print("Enter two integers: ");
    int a = input.nextInt(), b = input.nextInt();
    System.out.println("Sum = "+add(a, b));
    break;
case 2: //Greetings
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.println(greet(name));
    break;
case 3: //Circle's Area
    System.out.print("Enter radius: ");
    double r = input.nextDouble();
    System.out.println("Area = " + circleArea(r));
    break;
case 4: //Larger of 2
    System.out.print("Enter two numbers: ");
    int x = input.nextInt(), y = input.nextInt();
    System.out.println("The larger number is "+larger(x, y));
    break;
case 5: //Fahrenheit to Celsius
    System.out.print("Enter Fahrenheit temperature: ");
    double f = input.nextDouble();
    System.out.println("Celsius = " + toCelsius(f));
    break;
case 6: //Show Student Info
    System.out.print("Enter student name: ");
    String sname = input.nextLine();
    System.out.print("Enter grade: ");
    int grade = input.nextInt();
    System.out.println(showStudent(sname, grade));
    break;
case 7: //Discounted price
    System.out.print("Enter price and discount (%): ");
    double price = input.nextDouble(), percent = input.nextDouble();
    System.out.println("Discounted price = $" + discounted(price, percent));
    break;
case 8: //Even or Odd
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    System.out.println("The number is "+ isEvenOdd(n));
    break;
case 9: //String Length
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    System.out.println("Length = " + strLength(str));
    break;
case 10: //Average of 3
    System.out.print("Enter three integers: ");
    int n1 = input.nextInt(), n2 = input.nextInt(), n3 =
    input.nextInt();
    System.out.println("Average = " + average(n1, n2, n3));
    break;
case 0: //Ends the programn
    System.out.println("Exiting program. Goodbye!");
    break;
default: //Notes the input as invalid, and runs the 'do' loop again
System.out.println("Invalid choice. Try again.");
    break;
}}while (choice != 0);

input.close();
}

public static int add(int a, int b){    //return the sum of the two numbers
    return (a+b);
}
public static String greet(String name){    //return "hello" and the inputed name
    return "Hello "+name;
}
public static double circleArea(double r){  //retrun the area of a circle with the radius inputed
    return Math.PI*(r*r);
}
public static int larger (int x, int y){    //return the largest of the two numbers
    if (x>y){
        return x;
    }
    else{
        return y;
    }
}
public static double toCelsius (double f){  //return the Celsius equivilent of the Fahrenheit value
    return ((f-32) * 5 / 9);
}
public static String showStudent(String sname, int grade){  //return the name and grades of a student neatly formated
    return "Name: "+sname+", Grade:"+grade;
}
public static double discounted(double price, double percent){  //return the new price of an item basde on the discount provided (not the discount amount)
    return price - (price*percent / 100);
}
public static String isEvenOdd (int num){   //return "even" or "odd" depending on the modulus value of an integer
    if (num % 2 == 0){  //"%" stands for modulus, whihc returns the remainder of the numberator and denominator
        return "even";
    }
    else{
        return "odd";
    }
}
public static int strLength (String str){   //return the numeric length of a string
    return str.length();    //this function counts everything character a string, including spaces
}
public static double average(int n1, int n2, int n3){   //return the average of 3 integers
    return (n1+n2+n3)/3.0;  //denominator has a decimal to force return a double value; it'll return a integer otherwise
}
} //Awesomesauce