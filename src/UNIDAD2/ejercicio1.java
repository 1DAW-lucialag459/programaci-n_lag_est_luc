package UNIDAD2;

import java.util.Scanner;


public class ejercicio1 {

    public static void main(String[] args) {
        int n = eco();
        for(int i=1; i<=n; i++){
            System.out.println("Eco");
        }

    }
    public static int eco () {
        System.out.println("Dime cuantas veces quieres escribir eco");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        return n;
    }
}



    //public static void main(String[] args) {
    //    int n = eco();
      //  System.out.println("Dime cuantas veces quieres escribir eco");
//        Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
     //   }

   // }
   // public static void eco () {
   //    for(int i=1; i<=n; i++){
//           // System.out.println("Eco");
   // }
//}