package UNIDAD2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        numeros();
    }
    public static void numeros() {
        System.out.println("Dime dos números enteros");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = (n1+1); i < n2; i++) {
            System.out.println(i);
        }
    }
}




