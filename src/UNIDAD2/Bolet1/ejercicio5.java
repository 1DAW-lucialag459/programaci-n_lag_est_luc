package UNIDAD2.Bolet1;

import java.util.Scanner;

public class ejercicio5 {
//    public static void main(String[] args) {
//        numeros();
//    }
//
//    public static void numeros() {
//        System.out.println("Dime tres números enteros");
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int n3 = sc.nextInt();
//
//        if (n1 == n2 || n2 == n3 || n1 == n3) {
//            System.out.println("Los números son iguales, escribe otro");
//        } else if (n1 > n2 && n1 > n3) {
//            System.out.println("El número mayor es " + n1);
//        } else if (n2 > n1 && n2 > n3){
//            System.out.println("El número mayor es " + n2);
//        }else if (n3 > n1 && n3 > n2){
//            System.out.println("El número mayor es " + n3);
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

    public static void mayor(int numeroTeclado, int numeroTeclado2, int numeroTeclado3) {

        int numeroMayor = Math.max(numeroTeclado, Math.max(numeroTeclado2, numeroTeclado3));
        System.out.println("El mayor de los 3 número es: " + numeroMayor);
        return;
    }
}







