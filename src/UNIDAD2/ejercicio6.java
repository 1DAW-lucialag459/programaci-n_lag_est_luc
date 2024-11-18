package UNIDAD2;

import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Dime una letra:  ");
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);
        vocal(letra);
    }
    public static void vocal(char letra) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra " + letra + " es una vocal.");
        } else {
            System.out.println("La letra " + letra + " no es una vocal.");
        }
    }
}


