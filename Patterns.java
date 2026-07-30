public class Patterns {
    public static void main(String[] args) {

    // Rectangle 
    //     int n = 4;
    //     int m = 5;

    //     //outer loop
    //     for(int i = 1; i <=n; i++){

    //         //inner loop
    //         for(int j =1; j<=m; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // Hollow Rectangle
    // int n = 4;
    // int m = 5;

    // for(int i = 1; i<=n; i++){
    //     for(int j = 1; j<=m;j++){
    //         //cell -> (i,j)
    //         if (i==1 || j==1 || i==n || j==m) {
    //             System.out.print("*");
    //         }else {
    //             System.out.print(" ");
    //         }
    //     }System.out.println();
    // }

    
    //Half Pyramid
    // int n = 5;

    // for (int i = 1; i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

        // ANOTHER METHOD OF HALF PYRAMID
    // for (int i = 1; i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if( i>=j || i==j){
    //             System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }System.out.println();
    // } 

    // int n = 5;

    // for (int i = n; i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    int n = 5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){

        }System.out.print(" ");
    } System.out.println("*");


    }
}