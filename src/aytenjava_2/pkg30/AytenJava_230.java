/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aytenjava_2.pkg30;

import java.util.Scanner;

/**
 *
 * @author Aytan
 */
public class AytenJava_230 {

    /**
     * @param args the command line arguments
     */
 //EXERCISE 2.17
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

       /*int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int largest;
        int smallest;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = sum / 3;
        product = num1 * num2 * num3;

        largest = num1;
        smallest = num1;

        if(num2 > largest)
            largest = num2;

        if(num3 > largest)
            largest = num3;

        if(num2 < smallest)
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;

        System.out.println("The sum is " + sum);

        System.out.println("The average is " + average);

        System.out.println("The product is " + product);

        System.out.println("Largest of three integers is " + largest + " and the smallest is "+ smallest + "."); */
        
        //EXERCISE 2.24
        
     /*
		int num1;	
		int num2;	
		int num3;	
		int num4;	
		int num5;	
		int smallest;	
		int largest;
		
		System.out.print("Enter first integer: ");	
		num1 = input.nextInt(); 
		
		System.out.print("Enter second integer: ");	
		num2 = input.nextInt();	
		
		System.out.print("Enter third integer: ");	
		num3 = input.nextInt();	
		System.out.print("Enter fourth integer: ");	
		num4 = input.nextInt(); 
		
		System.out.print("Enter fifth integer: ");	
		num5 = input.nextInt();	
		smallest = num1;		
		if (num2 < smallest)
			smallest = num2;
		
		if (num3 < smallest)
			smallest = num3;
		
		if (num4 < smallest)
			smallest = num4;
		
		if (num5 < smallest)
			smallest = num5;
		
		largest = num1;	
		if (num2 > largest)
			largest = num2;
		
		if (num3 > largest)
			largest = num3;
		
		if (num4 > largest)
			largest = num4;
		
		if (num5 > largest)
			largest = num5;
		
		System.out.printf("Smallest integer is: %d\n", smallest);	
		System.out.printf("Largest integer is %d\n", largest);	
        */

     //EXERCISE 2.25
     
     /*
		int num;	
		
		System.out.print("Enter an integer: ");	
		num = input.nextInt();	
		if (num % 2 == 0)
			System.out.printf("%d is an even number", num);	
		if (num % 2 != 0)
			System.out.printf("%d is an odd number", num);	
     
     */
     
     //EXERCISE 2.26
     /*
        int firstNum=0;
        int secondNum=0;
        System.out.println("Enter first number:");
        firstNum=input.nextInt();
       
        System.out.println("Enter second number:");
        secondNum=input.nextInt();
       
        if(number(firstNum, secondNum)){
        System.out.println(firstNum + " is a multiple of " + secondNum);
        }
        else{
        System.out.println(firstNum + " is  not a multiple of " + secondNum);
        }
       
     }
     public static boolean number(int num1, int num2){
     if((num1%num2)==0)
         return true;
                 else
         return false;
    }
     */
     
     //EXERCISE 2.28
     /*
     Scanner input = new Scanner(System.in);
		
		int r;	
		
		System.out.print("Enter the radius of the circle: ");	
		r = input.nextInt();	
		
		System.out.printf("Diameter of the circle is %d\n", (2 * r));	
		System.out.printf("Circumference of the circle is %.2f\n", (2* (Math.PI) * r));	
		System.out.printf("Area of the circle is %.2f\n", ((Math.PI) * (r * r)));
     */
     
     //EXERCISE 2.29
     /*
      System.out.printf( "The character %c has the value %d\n",
        'A', ( (int) 'A' ) );
        System.out.printf( "The character %c has the value %d\n",
        'B', ( (int) 'B' ) );
        System.out.printf( "The character %c has the value %d\n",
        'C', ( (int) 'C' ) );
        System.out.printf( "The character %c has the value %d\n",
         'a', ( (int) 'a' ) );
        System.out.printf( "The character %c has the value %d\n",
         'b', ( (int) 'b' ) );
        System.out.printf( "The character %c has the value %d\n",
         'c', ( (int) 'c' ) );
         System.out.printf( "The character %c has the value %d\n",
          '0', ( (int) '0' ) );
         System.out.printf( "The character %c has the value %d\n",
          '1', ( (int) '1' ) );
         System.out.printf( "The character %c has the value %d\n",
          '2', ( (int) '2' ) );
         System.out.printf( "The character %c has the value %d\n",
          '$', ( (int) '$' ) );
           System.out.printf( "The character %c has the value %d\n",
          '*', ( (int) '*' ) );
           System.out.printf( "The character %c has the value %d\n",
          '+', ( (int) '+' ) );
          System.out.printf( "The character %c has the value %d\n",
           '/', ( (int) '/' ) );
          System.out.printf( "The character %c has the value %d\n",
             ' ', ( (int) ' ' ) );
     */
     
     //EXERCISE 2.30
     /*
     Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number with five digits: ");	
		num = input.nextInt();	
		if ( (num >= 10000) && (num <= 99999) )
		{
		System.out.printf("%d   ", (num / 10000));
		System.out.printf("%d   ", (num / 1000) % 10);
		System.out.printf("%d   ", (num / 100) % 10);
		System.out.printf("%d   ", (num % 100) / 10);
		System.out.printf("%d   ", (num % 10));
		}
		
		if (num > 99999)
			System.out.println("You had entered a number more than five digits.");
                        
		if (num <= 9999)
			System.out.println("You had entered a number less than five digits.");
     */
     
    //EXERCISE 2.31
    /*
      int num;
		
		System.out.println("number"+"\t"+"square"+"\t"+"cube");
		
		num = 0;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 1;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 2;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 3;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 4;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 5;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 6;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 7;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 8;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 9;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 10;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
    */
    
    //EXERCISE 2.32
		/*
		int num1;	
		int num2;	
		int num3;	
		int num4;	
		int num5;	
		int totalNeg=0;	
		int totalPos=0;
		int totalZero=0;	
		
		System.out.print("Enter first integer: ");	
		num1 = input.nextInt();	
		
		System.out.print("Enter second integer: ");	
		num2 = input.nextInt();	
		
		System.out.print("Enter third integer: ");	
		num3 = input.nextInt();	
		System.out.print("Enter fourth integer: ");	
		num4 = input.nextInt();	
		
		System.out.print("Enter fifth integer: ");	
		num5 = input.nextInt();	
		
		if (num1 < 0)
			totalNeg = totalNeg + 1;	
		
		if (num2 < 0)
			totalNeg = totalNeg + 1;
		
		if (num3 < 0)
			totalNeg = totalNeg + 1;
	
		if (num4 < 0)
			totalNeg = totalNeg + 1;
		
		if (num5 < 0)
			totalNeg = totalNeg + 1;
		
		if (num1 > 0)
			totalPos = totalPos + 1;
		
		if (num2 > 0)
			totalPos = totalPos + 1;
		
		if (num3 > 0)
			totalPos = totalPos + 1;
		
		if (num4 > 0)
			totalPos = totalPos + 1;
		
		if (num5 > 0)
			totalPos = totalPos + 1;
		
		if (num1 == 0)
			totalZero = totalZero + 1;
		
		if (num2 == 0)
			totalZero = totalZero + 1;
		
		if (num3 == 0)
			totalZero = totalZero + 1;
		
		if (num4 == 0)
			totalZero = totalZero + 1;
		
		if (num5 == 0)
			totalZero = totalZero + 1;
		
		System.out.println();
		System.out.printf("Total negative numbers: %d\n", totalNeg);	
		System.out.printf("Total postive numbers: %d\n", totalPos);	
		System.out.printf("Total zero numbers: %d\n", totalZero); */	
    
    //EXERCISE 2.33
   /* System.out.print("Enter your weight with kg: ");
    double weightInKg=input.nextDouble();
    System.out.print("Enter your height with meters: ");
    double heightInMeters=input.nextDouble();
    double BMI = weightInKg/(heightInMeters*heightInMeters);
    if(BMI<18.5){
        System.out.printf("Underweight. Your BMI values: %. 1f\n",BMI);
    }
    if(BMI>18.5&& BMI<24.9){
        System.out.printf("Normal. Your BMI values: %. 1f\n",BMI);
    }
    if(BMI>25&&BMI<29.9){
        System.out.printf("Overweight. Your BMI values: %. 1f\n",BMI);
    }
    if(BMI>=30){
        System.out.printf("Obese. Your BMI values: %. 1f\n",BMI);
    }*/
    
    
    
    
    //EXERCISE 2.34
   /* double currentPopulation;
      double yearOne;
      double yearTwo;
      double yearThree;
      double yearFour;
      double yearFive;
      float growthRate;

      System.out.print( "Enter the current world population (exclude commas): ");
      currentPopulation = input.nextDouble();

      System.out.print( "Enter the annual world population growth rate (in percent): ");
      growthRate = input.nextFloat();
      growthRate = growthRate / 100;

      yearOne = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "\nWorld population after one year: %.0f\n", yearOne );

      currentPopulation = yearOne;
      
      yearTwo = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "                after two years: %.0f\n", yearTwo );

      currentPopulation = yearTwo;

      yearThree = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "              after three years: %.0f\n", yearThree );

      currentPopulation = yearThree;
      
      yearFour = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "               after four years: %.0f\n", yearFour );

      currentPopulation = yearFour;

      yearFive = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "               after five years: %.0f\n", yearFive );
    */
   
   
   //EXERCISE 2.35
   /*int miles,gasCost,mpg,parkFee,tolls,total;
   System.out.print("Please, Enter the total miles driven per day: ");
    miles=input.nextInt();
    System.out.print("Please, Enter the per gallon miles of gasoline: ");
    gasCost=input.nextInt();
    System.out.print("Please, Enter the average miles per gallon:  ");
    mpg=input.nextInt();
    System.out.print("Please, Enter the parking fees per day: ");
    parkFee=input.nextInt();
    System.out.print("Please, Enter the tools per day: ");
    tolls=input.nextInt();
    total=tolls+parkFee+(miles/mpg)*gasCost;
    System.out.printf("Your daily cost:  $%d\n",total);*/
   
   
   
    }
    
    

}



