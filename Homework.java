import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
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
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            
            default:System.out.println("Invalid Button");
        }
    }
}

