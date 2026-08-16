import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age > 18 ) {
        //     System.out.println("Adult");
        // } else{
        //     System.out.println("Not Adult");
        // }


        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // if (x%2==0) {
        //     System.out.println("Even number.");
        // }
        // else {
        //     System.out.println("Odd number.");
        // }

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a==b) {
        //     System.out.println("Both are equal");
        // } else if (a>b) {
        //         System.out.println("A is bigger");
        // } else {
        //         System.out.println("B is bigger");
        // }

        
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        // BUTTON USING  IF ELSE

        // if(button == 1) {
        //     System.out.println("Hello");
        // } else if(button == 2) {
        //     System.out.println("Namaste");
        // } else if(button == 3) {
        //     System.out.println("Bonjour");
        // } else {
        //     System.out.println("Invalid Button");
        // }

        // BUTTON USING *SWITCH*
        switch (button) {
            case 1: System.out.println("Hello");
                break;
            case 2: System.out.println("Namaste");
                break;
            case 3: System.out.println("Bonjour");
                break;
            default: System.out.println("Invalid Button");
        }
    }
    }
 


    