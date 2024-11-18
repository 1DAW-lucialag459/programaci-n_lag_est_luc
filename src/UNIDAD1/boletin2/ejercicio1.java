package UNIDAD1.boletin2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int numreal;
        System.out.println("Dame un número real ");
        Scanner sc = new Scanner(System.in);
        numreal= sc.nextInt();

        if(numreal>0){
            System.out.println("El número es positivo");
        } if(numreal>0) {
            System.out.println("El número es negativo");
        }
        if (numreal==0)
            System.out.println("El número es cero");
    }
}
