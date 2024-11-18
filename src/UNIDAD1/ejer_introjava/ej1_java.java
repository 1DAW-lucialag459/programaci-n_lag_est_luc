package UNIDAD1.ejer_introjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ej1_java {
    public static void main(String[] args) {
        int año;
        int año2;
        System.out.println("Dime que año es  ");
        Scanner sc = new Scanner(System.in);
        año= sc.nextInt();

        System.out.println("Dime en que año naciste  ");
        año2= sc.nextInt();
        int resultado;
        resultado=año-año2;
        System.out.println("Tu edad es  " + resultado);

    }
}
