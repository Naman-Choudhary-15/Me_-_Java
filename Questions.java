import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Sum of these values are:" + (a+b));

        
        //**Print the sum of first n natural numbers.

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int sum = 0;
        // for(int i=1; i<=n; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);


        // ***Print the table of a number by the user.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i * n);
        }
    }
}
