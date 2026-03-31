// Javon Green
// M4HW2
// 3.26.2026
// Create a progrom that determines if the user can vote, and state any reasons that make them ineligible

import java.util.Scanner;

public class M4HW2_Green {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //DECLARE
    int registered, age, citizenship, felonyOrProbation, vote = 0;

    //INPUT
    System.out.println("For the following questions, type 1 for true and 2 for false:");
    System.out.print("Are you 18 years of age? ");
    age = input.nextInt();
    System.out.print("Have you lived in your registered country for at least 30 days? ");
    registered = input.nextInt();
    System.out.print("Are you a citizen of the United States? ");
    citizenship = input.nextInt();
    System.out.print("Are you serving a felony sentence, or on any form of probation? ");
    felonyOrProbation = input.nextInt();

    //Calculate
    if(registered==1){
        if(age==1){
            if(citizenship==1){
                if(felonyOrProbation==2){
                    vote = 1;
                }
            }
        }
    }

    //Output
    if(vote==1){
        System.out.println("Congragulations! You are eligible to vote");
    }
    else{
        System.out.println("You are ineligable to vote for the following reasons:");
        if(registered!=1){
            System.out.println("You must live in your registered country for at least 30 days.");
        }
        if(age!=1){
            System.out.println("You must be 18 years of age or older.");
        }
        if(citizenship!=1){
            System.out.println("You must be a citizen of the United States.");
        }
        if(felonyOrProbation!=2){
            System.out.println("You cannot vote while currently serving a felony or currently on probation.");
        }
    input.close();
}
}}