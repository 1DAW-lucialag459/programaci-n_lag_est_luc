package UNIDAD2.Diapositivas;

import java.util.Scanner;

public class stringej2 {
    public static void main(String[] args) {
        System.out.println("Introduce dos cadenas");
        Scanner sc = new Scanner(System.in);
        String cad1 = sc.nextLine();
        String cad2 = sc.nextLine();

        int c1=cad1.length();
        int c2=cad1.length();

        if(c1>c2){
            System.out.println("La cadena" + cad2 + "es más corta que " + cad1);
        }else if (c2>c1){
            System.out.println("La cadena " + cad1 + "es más corta que " + cad2);
        }else{
            System.out.println("La cadena " + cad1 + " y " + cad2 + "son iguales");
        }

    }

}
