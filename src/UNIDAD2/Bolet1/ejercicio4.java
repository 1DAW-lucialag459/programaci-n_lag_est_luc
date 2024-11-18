package UNIDAD2.Bolet1;

import java.util.Scanner;

public class ejercicio4 {
    //este es el mio, el otro sta mejor
//    public static void main(String[] args) {
//        numeros();
//    }
//    public static void numeros() {
//        System.out.println("Dime dos números enteros");
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//
//        if (n1 == n2) {
//            System.out.println("Los dos números son iguales, escribe otro");
//        } else if (n1 > n2) {
//            System.out.println("El número mayor es " + n1);
//        } else if (n2 > n1) {
//            System.out.println("El número mayor es " + n2);
//        }
//    }
//}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Escribe los dos números:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int n = mayor(n1, n2);
        System.out.println("El mayor es: " + n);
    }

    /*
     * Esta función devuelve el mayor de dos números y en caso de ser iguales devuelve el cero
     */
    public static int mayor(int n1, int n2) {
        int n = 0;
        if (n1 > n2) {
            n = n1;
        } else if (n2 > n1) {
            n = n2;
        } else {
            System.out.println("Los números no pueden ser iguales");
            n = n1;
        }
        return n;
    }
}
