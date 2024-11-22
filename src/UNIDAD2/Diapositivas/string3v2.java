package UNIDAD2.Diapositivas;

import java.util.Scanner;

// no esta hecho
public class string3v2 {
    public static void main(String[] args) {
        System.out.println("Vamos a jugar a acertar la contraseña");
        System.out.println("Dime una contraseña");
        Scanner sc = new Scanner(System.in);
        String contrasena = sc.nextLine();
        String intento;
        boolean acertado = false;

        System.out.println("Dime que versión quieres jugar: 1 o 2");
        int version= sc.nextInt();
        if(version==1) {

            do {
                System.out.println("Intenta acertar la contraseña");
                intento = sc.next();
                if (intento.length() < contrasena.length()) {
                    System.out.println("La contraseña es más larga");
                } else if (intento.length() > contrasena.length()) {
                    System.out.println("La contraseña es más corta");
                } else if (intento.equals(contrasena)){
                    System.out.println("Has acertado la contraseña");
                }
            } while (!intento.equals(contrasena));

        }else{
            System.out.println("Has elegido la opcion 2");
            while(!acertado){
                System.out.println("Introduce su propuesta");
                intento = sc.next();
                if(intento.equals(contrasena)){
                    acertado=true;
                }else{
                    for(int i = 0;i<contrasena.length();i++){
                        if(intento.charAt(i)==contrasena.charAt(i)){
                            System.out.print(intento.charAt(i));
                        }else{
                            System.out.print("*");
                        }

                    }

                }System.out.println();
            }
        }System.out.println("Has acertado la contraseña");
    }
    }
