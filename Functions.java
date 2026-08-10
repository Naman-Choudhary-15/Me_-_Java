import java.util.*;

                        // public static returnType functionName(type arg1, type arg2 ...){
          //Operation
        // }

public class Functions {

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); // function ko call kiya



    }
}
