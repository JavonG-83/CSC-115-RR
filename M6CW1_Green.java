import java.util.Scanner;
class M6CW1_green{
    public static void main(String args[]){
        println();
        runProgramn();
    }
public static void runProgramn(){
    System.out.println("===Method Project===");
    system.out.println();
    Scanner in = new Scanner (System.in);
    String keep_going = "yes";
    while(keep_going.equalsIgnoreCase("yes")){
        displayMenu();
        System.out.print("Are you sure you want to exit the programn? Type yes or no :");
        keep_going = in.next();
        System.out.println();
    }
    in.close();
    System.out.println("Programn terminated");
}
public static void displayMenu(){
    Scanner choice = new Scanner (Scanner.choice);
    System.out.println("---Menu---");
    System.out.println("1) M6HW1");
    System.out.println("2) M6HW2");
    System.out.println("3) M6HW3");
    System.out.println("4) Exit");
    System.out.println();
    System.out.print("Selection: ");
    switch (choice.nextInt){
        case 1;
    }
}

}