import java.util.*;
// public class Main {
//    public static void main(String args[]){
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }


// public class Main {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = n; i >= 1; i--) {

//         for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//         }

//         for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*");
//          }
//           System.out.println();
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
       String[] arr={"January","February","March","April","May","June","July","August","September","October","November","December"};
       int[] salary={1111,11128,11131,11130,5555,360,31988,31978,307737,33331,30333,333331};

     for(int i=0;i<12;i++){
            System.out.println(arr[i]+" salary is " +salary[i]);
     }
}
}