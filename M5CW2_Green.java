//Javon Green - 3.31.2026
//Create a programn that detemrines the sum and average of 5 prices, using a do-while structure loop

import java.util.Scanner;
public class M5CW2_Green { public void main (String args[]){

//Setup
Scanner input = new Scanner(System.in);
double sum=0, average=0, response;
int priceDo=5, priceWhile=0; //I'll initilize them as variables to help ,modify and track them when needed

//Implement the loop
do{
    System.out.print("Enter the price of item #"+priceWhile+1);
    response = input.nextInt();
    if(response>0 && response<=10000){
    sum += response;
    priceWhile+=1; 
    }
    else{
        System.out.println("Invalid. Please enter a price between $0 and $10,000.");
    }
}while (priceWhile<priceDo);

//Calculate & Output
average = sum/priceDo;
System.out.println("The total cost of the prices is: $"+sum);
System.out.println("the average of the prices is: $"+average);

input.close();
}}