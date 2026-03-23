

import java.util.Scanner;

public class M4HW2_Green {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //Variables
    int registeredCoutnry, age, citiznship, felonyOrProbation, vote = 0;

    //Input
    System.out.println("How long have you lived in the country your registering in:");
    registeredCoutnry = input.nextInt();
    System.out.println("What is your age?");
    age = input.nextInt();
    System.out.println("For the following questions, type 1 for yes or 2 for no");
    System.out.println("Are you a citizen of the United States?");
    citizenship = input.nextInt();
    System.out.println("Are you serving a felony sentence");
    felony = input.nextLine();
    System.out.println("Are your currently on any form of probation?");
    probation = input.nextLine();

    //Calculate
    if(registeredCoutnry>=30){
        if(age>=18){
            if(citizenship==1){
                if(felony==1){
                    if(probation==1){
                        vote = TRUE;
                    }
                }
            }
        }
    }

    //Output
    if(vote==TRUE){
        System.out.println("Congragulations! You are eligible to vote");
    }
    else{
        System.out.println("You are unable to vote for the following reasons:");
        if(registeredCountry<30){
            System.out.println("You must live in your registering country for at least 30 days");
        }
        if(age<18){
            System.out.println("You must be 18 years of age or older");
        }
        if(citizenship!=1){
            System.out.println("You must be a citizen of the United State");
        }
        if("felony!=1"){
            System.out.println("You cannot vote while serving a felony");
        }
        if(probation!=1){
            System.out.println("You cannot vote while on probation");
        }
    }
    input.close();
}
}