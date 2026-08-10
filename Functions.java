import java.util.*;

                        // public static returnType functionName(type arg1, type arg2 ...){
          //Operation
        // }

public class Functions {

    // public static void printMyName(String name) {
    //     System.out.println(name);
    //     return;
    // }

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name); // function ko call kiya

   // }

    
   //**Sum to two numbers

   public static int calculateSum(int a, int b){
    int sum = a + b;
    return sum;
   }
   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = calculateSum(a, b);
    System.out.println("Sum of two these numbers are: " + sum);

   }


}
