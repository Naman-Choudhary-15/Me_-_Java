import java.util.Scanner;

public class function_HW {

    // Make a function to check if a number is prime or not.

    public static void isPrime(int n){

        int Prime = n;

        if(n<0){
            System.out.println(" ! Invalid Number ! ");
        } else if (n%n==0 || n%1==0) {
            System.out.println("Prime No.");
        } else {
            System.out.println("Not Prime No.");
        return;
    }
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    isPrime(n);   
    }

    // Make a function to check if a given number n is even or not.



    // Make a function to print the table of a given number n.




    

}
