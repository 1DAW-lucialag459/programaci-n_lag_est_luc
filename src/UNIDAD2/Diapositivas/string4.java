package UNIDAD2.Diapositivas;

import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        System.out.println("Dime una frase");
        Scanner sc = new Scanner(System.in);
        String  frase = sc.nextLine();
        int cont =0;
    for (int i=0; i<frase.length(); i++){
        if (frase.charAt(i)==' '){
            cont++;
        }

    }

        System.out.println("hay "+ cont +" espacios");

        String frase2=frase.substring(0,4);
        System.out.println(frase2);
    }



}
