package UNIDAD1.boletin2;
import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        long positivos = 0;
        int ceros = 0;
        float sumnegativos = 0;
        int contneg = 0;
        for (int i=10; i >0 ; i --) {
            System.out.println("Inserta un número. Tienes " + i + " inserciones.");
            System.out.print("Positivo = Suma; Negativo = Media; Cero = Contador: ");
            float insercion = sn.nextFloat();
            if (insercion > 0) {
                positivos += insercion;
            } else if (insercion < 0) {
                contneg++;
                sumnegativos += insercion;
            } else {
                ceros ++;
            }
        }
        System.out.println("Suma de positivos = "+ positivos);
        System.out.println("Media de negativos = "+  (sumnegativos)/contneg);
        System.out.println("Cuenta de ceros = "+ ceros);
    }
}



