//Javon Green
//

import java.util.Scanner;

public class M4Test_GreenGreen{public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //DECLARE VARIABLES
    int majors, nonMajors;
    double total, percentMajors, percentNonMajors;

    //OBTAIN INPUTS
    System.out.print("Enter the number of students majoring in CS: ");
    majors = input.nextInt();
    System.out.print("Enter the number of non-computer science students: ");
    nonMajors = input.nextInt();

    //CALCULATE
    total = majors + nonMajors;
    percentMajors = (majors / total) * 100;
    percentNonMajors = (nonMajors / total) * 100;

    //OUTPUT RESULTS
    System.out.println("Majors: " + percentMajors + "%");
    System.out.println("Nonmajors: " + percentNonMajors + "%\n");

    input.close();
}}