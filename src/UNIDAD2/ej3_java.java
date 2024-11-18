package UNIDAD2;

import java.util.Scanner;

public class ej3_java {
    public static void main(String[] args) {

        int altura =0;
        System.out.print("Ingrese la altura del reloj de arena: ");
        Scanner sc = new Scanner(System.in);
        altura = sc.nextInt();
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("La altura debe ser un número impar o mayor o igual a 3.");
        } else {

            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (altura - i) * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i < altura; i++) {
                for (int j = 0; j < altura - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
