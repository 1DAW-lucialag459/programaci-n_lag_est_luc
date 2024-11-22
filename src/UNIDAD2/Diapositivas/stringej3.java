package UNIDAD2.Diapositivas;

import java.util.Scanner;

public class stringej3 {
    public static void main(String[] args) {
        System.out.println("Vamos a jugar a acertar la contraseña");
        System.out.println("Dime una contraseña");
        Scanner sc = new Scanner(System.in);
        String contrasena = sc.nextLine();
        String intento;

        do {
            System.out.println("Intenta acertar la contraseña");
             intento = sc.nextLine();
            if (intento.length() < contrasena.length()) {
                System.out.println("La contraseña es más larga");
            } else if (intento.length() > contrasena.length()) {
                System.out.println("La contraseña es más corta");
            } else {
                System.out.println("Has acertado la contraseña");
            }
        }while (!intento.equals(contrasena));

    }
}
