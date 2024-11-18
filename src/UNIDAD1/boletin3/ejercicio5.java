package UNIDAD1.boletin3;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        int num, num1, numnuevo = 0;
        int cont = 1;
        System.out.println("Introduce un número entero positivo ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        num1 = sc.nextInt();

        while (num > 0) {
            num1 = num % 10;
            num = num / 10;
        }
        if (num == 8 || num == 0) {
            cont++;
        } else {
            numnuevo = num1 * num;
            num *= 10;
        }
        System.out.println("Su número sin 8 ni 0 es: " + numnuevo);
        System.out.println("El total de números eliminados es " + cont);
    }
}


