//Javon Green - 3.31.2026
//M5HW1_Green
//Update the grade calculator to use repetition structures
//New method: Cleary define the step by step instructions, and any noteworthy additions made

import java.util.Scanner;
//1.Rename the file
public class M5HW1_Green{public static void main(String args[]){ 

String repeat = "y";
Scanner k = new Scanner(System.in);

do{
    double response, sum, average = 0;
    char grade;
    int gradeLimit, gradeIndex;

//2.Ask for the Number of Grades
    System.out.print("Type the amount of grades you want to input: ");
    gradeLimit = k.nextInt();
    gradeIndex = 0;
    sum = 0;

//3.Use a do-while loop
    do{
    System.out.print("Enter grade #"+(gradeIndex+1)+": ");
    response = k.nextDouble();
            //4.Validate each grade
    if (response>=0 && response<=100){
    sum += response;
    gradeIndex += 1;
    }
    else{
    System.out.println("Invalid. enter a grade between 0 and 100.");
    }
    }while(gradeIndex<gradeLimit);

//5.Calculate the average
    average = sum/gradeLimit;
//6.Determine the letter grade
    if (average >= 90)
    {
    grade = 'A';
    }
    else if (average >= 80)
    {
    grade = 'B';
    }
    else if (average >= 70)
    {
    grade = 'C';
    }
    else if (average >= 60)
    {
    grade = 'D';
    }
    else
    {
    grade = 'F';
    }
    System.out.println("Grade is " + grade);

//7.Prompt the user to repeat the program
    System.out.print("Do you want to rerun the program? (y/n): ");
    k.nextLine();
    repeat = k.nextLine();

}while(repeat.equals("y"));
System.out.println("Program ending. Have a good day");
k.close();
}}