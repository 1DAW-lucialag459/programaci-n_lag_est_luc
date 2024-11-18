package UNIDAD1.boletin3;
import java.util.Scanner;

public class ejercicios4 {


    public static void main(String[] args) {
        int i;
        int j;
        int n;
        System.out.println("Dime un número positivo");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j+ " ");


            }
            System.out.println();
        }


    }
}


