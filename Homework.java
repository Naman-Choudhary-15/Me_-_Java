import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        //**LECTURE 3 

        //QUESTION 1 

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // int diff = a-b;
        // int multi = a*b;
        // int div = a/b;
        // int mod = a%b;
        // int c = sc.nextInt();
        
        // switch (c) {
        //     case 1: System.out.println("Sum is: " + sum);
        //         break;
        //     case 2: System.out.println("Difference is: " + diff);
        //         break;
        //     case 3: System.out.println("Multipication is: " + multi);
        //         break;
        //     case 4: System.out.println("Division is: " + div);
        //         break;
        //     case 5: System.out.println("Modulus is: " + mod);
        //         break;
        //     default: System.out.println("Not a Operation");
        // }

        //QUESTION 2 
        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // switch (button) {
        //     case 1: System.out.println("January");
        //         break;
        //     case 2: System.out.println("February");
        //         break;
        //     case 3: System.out.println("March");
        //         break;
        //     case 4: System.out.println("April");
        //         break;
        //     case 5: System.out.println("May");
        //         break;
        //     case 6: System.out.println("June");
        //         break;
        //     case 7: System.out.println("July");
        //         break;
        //     case 8: System.out.println("August");
        //         break;
        //     case 9: System.out.println("September");
        //         break;
        //     case 10: System.out.println("October");
        //         break;
        //     case 11: System.out.println("November");
        //         break;
        //     case 12: System.out.println("December");
        //         break;
            
        //     default:System.out.println("Invalid Button");
        // }


        //**LECTURE 4

        //QUESTION 1 - Print all even numbers till n

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i = 0; i<=n; i ++) {
        //     if(i%2 == 0) {
        //     System.out.println(i);
        //     }
        // }

        //QUESTION 2 - 

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     if(n == 0) {
    //     Scanner scc = new Scanner(System.in);
    //     int i = scc.nextInt();
    //     do {
    //         if (i>=90) {
    //             System.out.println("This is Good");
    //         } else if (89>=i && i>=60) {
    //                 System.out.println("This is also Good");
    //         } else if (59>=i && i>=0) {
    //             System.out.println("This is Good as well, Because marks do not matter but our effort does");
    //         }
            
    //     }while (i<=1);
    // } else {
    //     System.out.println("Stop");
    // }


                // ***MAIN METHOD***

    //     Scanner sc = new Scanner(System.in);
    //    int input;


    //    do {
    //        int marks = sc.nextInt();
    //        if(marks >= 90 && marks <= 100) {
    //            System.out.println("This is Good");
    //        } else if(marks >= 60 && marks <= 89) {
    //            System.out.println("This is also Good");
    //        } else if(marks >= 0 && marks <= 59) {
    //            System.out.println("This is Good as well");
    //        } else {
    //            System.out.println("Invalid");
    //        }


    //        System.out.println("Want to continue ? (yes(1) or no(0))");
    //        input = sc.nextInt();
      
    //    } while(input == 1);
   

    // QUESTION 3 - 
    //  Print if a number is prime or not (Input n from the user). 

    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();


    //    boolean isPrime = true;
    //    for(int i=2; i<=n/2; i++) {
    //        if(n % i == 0) {
    //            isPrime = false;
    //            break;
    //        }
    //    }


    //    if(isPrime) {
    //        if(n == 1) {
    //            System.out.println("This is neither prime not composite");
    //        } else {
    //            System.out.println("This is a prime number");
    //        }
    //    } else {
    //        System.out.println("This is not a prime number");
    //    }


    

    //  Lecture 5

    // QUESTION 1 - 
    // Print a solid rhombus.

    // int n = 4;
      
    //    for(int i=n; i>=1; i--) {
    //        for(int j=1; j<=i; j++) {
    //                System.out.print(" ");
    //        }System.out.println("*****");
        
    //    }


    // QUESTION 2 -
    // Print a number pyramid.

    // int n = 5;
    // int number = 1;

    // for(int i =1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }

    //     for(int j =1;j<=i;j++) {
    //         System.out.print(number + " ");
    //     }
    //     number++;
    //     System.out.println();
    // }

    // QUESTION 3 -
    // Print a palindromic number pyramid.

    // int n = 5;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     } 

    //     for(int j=i;j>=1;j--){
    //         System.out.print(j);
    //     }

    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    //  ***MORE LOOPS PROBLEM***

    // Print a hollow Butterfly

    // int n =5;

    // for(int i=1;i<=n;i++){ 
    //     for(int j=1;j<=i;j++){
    //         if(i==j || j==1 ){
    //         System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }
    //     for(int j=2*(n-i);j>=1;j--){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         if(i==j || j==1 ){
    //         System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }System.out.println();  
    //     }

    // for(int i=n;i>=1;i--){ 
    //     for(int j=1;j<=i;j++){
    //         if(i==j || j==1 ){
    //         System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }
    //     for(int j=2*(n-i);j>=1;j--){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         if(i==j || j==1 ){
    //         System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }System.out.println();  
    //     }


    // Hollow Rhombus

    // int n=5;

    // for(int i=5;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" ");
    // }
    //     for(int j=1;j<=n;j++){
    //         if(j==1 || j==n || i==1 || i==n) {
    //         System.out.print("*"); 
    //     } else { System.out.print(" ");}
    //     }System.out.println();

    // }


    // Print Pascal's Triangle




    // Print Half Pyramid

    // int n =5;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");}

    //     for(int j=1;j<=i;j++){
    //         System.out.print(j + " ");
    //     }System.out.println();
    // }


    // Print Inverted Half Pyramid

    int n=5;
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n-i;j++){
            System.out.print(i + " ");
        }System.out.println();
    }

    

    // Make a function to check if a number is prime or not.



    // Make a function to check if a given number n is even or not.



    // Make a function to print the table of a given number n.




    

    }
}