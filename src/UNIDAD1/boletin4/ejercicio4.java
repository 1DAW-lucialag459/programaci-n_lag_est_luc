package UNIDAD1.boletin4;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        int num=0;
        int numeronew =0;
        int eliminados =0;
        int numclave = 0;
        int factor = 1;
        System.out.println("Introduce un número positivo: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();


        while (num > 0) {
            numclave = num % 10;
            num = num / 10;
        }
        if (numclave == 0 || numclave == 8) {
            eliminados += 1;
        } else {
            numeronew += numclave * factor;
            factor *= 10;
        }
        System.out.println("El número después de eliminar 0 y 8 es  " +  numeronew);
        System.out.println("Cantidad de dígitos eliminados:" + eliminados);


    }
}
