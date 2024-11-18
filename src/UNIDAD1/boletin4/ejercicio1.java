package UNIDAD1.boletin4;

import java.util.Scanner;

public class ejercicio1 {

        public static void main(String[] args) {
            int i;
            int j;
            System.out.print("Introduce la altura de los calcetines: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for (i = 1; i <=(num-2); i++) {
                for (j = 1; j <= 2; j++) {
                    System.out.print("*****");
                }
                System.out.println();
            }
        }
    }


