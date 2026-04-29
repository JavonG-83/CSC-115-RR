import java.util.Scanner;

class M6CW1_green{

    static Scanner in = new Scanner(System.in);
    public static void main(String args[]){
        runProgramn();
    }
    
    public static void runProgramn(){
    System.out.println("===Method Project===");
    System.out.println();
    String end_programn = "no";
    while(end_programn.equalsIgnoreCase("no")){
        displayMenu();
        System.out.print("Are you sure you want to exit the programn? Type yes or no :");
        end_programn = in.next();
        System.out.println();
    }
    System.out.println("Programn terminated");
    in.close();
}
    
    public static void displayMenu(){
    System.out.println("==Menu==");
    System.out.println();
    System.out.println("1) --Gross Pay Calculator--");
    System.out.println("2) --Monthly Water Bill--");
    System.out.println("3) --Sales Commissions Calculator--");
    System.out.println("4) --Exit--");
    System.out.println();
    System.out.print("Selection: ");
    switch (in.nextInt()) {
        case 1:
            System.out.println();
            getM6HW1();
            System.out.println();
            displayMenu(); // redisplay menu
            break;
        case 2:
            System.out.println();
            getM6HW2();
            System.out.println();
            displayMenu(); // redisplay menu
            break;
        case 3:
            System.out.println();
            getM6HW3();
            System.out.println();
            displayMenu(); // redisplay menu
            break;
        case 4:
            System.out.println("Exiting the program...");
            break;
        default:
            System.out.println("Invalid selection. Try again.");
            displayMenu(); // redisplay menu
    }
}
    
    public static void getM6HW1(){
    //Design a programn that calculates gross pay
    System.out.println("--Gross Pay Calculator--");

        //Declare
    String name;
    double rate, hours, gross;
        //Prompt users for their name, pay rate, and hours worked
    System.out.println();
    System.out.print("Enter your name: ");
    in.nextLine(); //Clears the buffer
    name = in.nextLine();
    System.out.print("Enter pay rate: ");
    rate = in.nextDouble();
    System.out.print("Enter hours worked: ");
    hours = in.nextDouble();
    System.out.println();
        //Calculate gross pay
    gross = rate * hours;
        //Display results
    System.out.println("Name: "+name);
    System.out.println("Pay Rate: "+rate);
    System.out.println("Hours Worked: "+hours);
    System.out.println("Gross Pay: "+gross);
}
    
    public static void getM6HW2(){
    //Design a programn that calculates a monthly water bill
    System.out.println("--Monthly Water Bill--");
    
        //Declare
    String name;
    double previous, current, usage, charge;
        //Propmt users for their name, and recent water meter readings
    System.out.println();
    System.out.print("Enter name: ");
    in.nextLine(); //Clears the buffer
    name = in.nextLine();
    System.out.print("Enter previous month's meter reading: ");
    previous = in.nextDouble();
    System.out.print("Enter current month's meter reading: ");
    current = in.nextDouble();
    System.out.println();
        //Calculate usage and charge
    usage = current - previous;
    charge = (usage*0.2) + 50;
        //Dispaly results
    System.out.println("Name: "+name);
    System.out.println("Previous reading: "+previous);
    System.out.println("Current reading: "+current);
    System.out.println("Total charge for month: "+charge);
}
    
    public static void getM6HW3(){
    //Design a programn that calculate monthly commisions for widget sales
    System.out.println("--Sales Commissions Calculator--");

        //Declare
    String name;
    int sold, returned, net;
    double commission;
        //Prompt users for their name, widgets sold and widgets returned
    System.out.println();
    System.out.print("Enter name: ");
    in.nextLine(); //Clears the buffer
    name = in.nextLine();
    System.out.print("Enter widgets sold: ");
    sold = in.nextInt();
    System.out.print("Enter widgets returned: ");
    returned = in.nextInt();
    System.out.println();
        //Calculate net widgets sold and commission earned
    net = sold - returned;
    commission = (net*0.1)+500;
        //Dispaly Results
    System.out.println("Name: "+name);
    System.out.println("Net widgets sold: "+net);
    System.out.println("Total commision earned: "+commission);
}
}