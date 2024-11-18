package UNIDAD1.boletin2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("Dime dos números");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("El número " + " " + num1 + " " + "es mayor que " + " " + num2);
        }if (num2 > num1){
            System.out.println("El número " + " " + num2 + " " + "es mayor que " + " " + num1);
        }if (num1==num2){
            System.out.println("El primer número es igual que el segundo");
        }
    }
}
