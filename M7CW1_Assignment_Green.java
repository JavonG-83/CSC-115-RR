import java.util.Scanner;
public class M7CW1_Assignment_Green{

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int choice;
do {
//List of stuff
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
case 1:
    System.out.print("Enter two integers: ");
    int a = input.nextInt(), b = input.nextInt();
    System.out.println("Sum = "+add(a, b));
    break;
case 2:
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.println(greet(name));
    break;
case 3:
    System.out.print("Enter radius: ");
    double r = input.nextDouble();
    System.out.println("Area = " + circleArea(r));
    break;
case 4:
    System.out.print("Enter two numbers: ");
    int x = input.nextInt(), y = input.nextInt();
    System.out.println("The larger number is "+larger(x, y));
    break;
case 5:
    System.out.print("Enter Fahrenheit temperature: ");
    double f = input.nextDouble();
    System.out.println("Celsius = " + toCelsius(f));
    break;
case 6:
    System.out.print("Enter student name: ");
    String sname = input.nextLine();
    System.out.print("Enter grade: ");
    int grade = input.nextInt();
    System.out.println(showStudent(sname, grade));
    break;
case 7:
    System.out.print("Enter price and discount (%): ");
    double price = input.nextDouble(), percent = input.nextDouble();
    System.out.println("Discounted price = $" + discounted(price, percent));
    break;
case 8:
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    System.out.println("The number is "+ isEvenOdd(n));
    break;
case 9:
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    System.out.println("Length = " + strLength(str));
    break;
case 10:
    System.out.print("Enter three integers: ");
    int n1 = input.nextInt(), n2 = input.nextInt(), n3 =
    input.nextInt();
    System.out.println("Average = " + average(n1, n2, n3));
    break;
case 0: 
    System.out.println("Exiting program. Goodbye!");
    break;
default: System.out.println("Invalid choice. Try again.");
    break;
}}while (choice != 0);

input.close();
}

public static int add(int a, int b){
    return (a+b);
}
public static String greet(String name){
    return "Hello "+name;
}
public static double circleArea(double r){
    return Math.PI*(r*r);
}
public static int larger (int x, int y){
    if (x>y){
        return x;
    }
    else{
        return y;
    }
}
public static double toCelsius (double f){
    return ((f-32) * 5 / 9);
}
public static String showStudent(String sname, int grade){
    return "Name: "+sname+", Grade:"+grade;
}
public static double discounted(double price, double percent){
    return price - (price*percent / 100);
}
public static String isEvenOdd (int num){
    if (num % 2 == 0){
        return "even";
    }
    else{
        return "odd";
    }
}
public static int strLength (String str){
    return str.length();
}
public static double average(int n1, int n2, int n3){
    return (n1+n2+n3)/3.0;
}
}
