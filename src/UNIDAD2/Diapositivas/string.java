package UNIDAD2.Diapositivas;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        boolean esIgual = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena1 = scanner.next();

        System.out.println("Introduce otra cadena");
        String cadena2 = scanner.next();

        if(cadena1.length() == cadena2.length()){
            int cont_posicion = 0;
            while(esIgual && cont_posicion <= (cadena1.length()-1)){

                char letra1 = cadena1.charAt(cont_posicion);
                char letra2 = cadena2.charAt(cont_posicion);

                if(letra1 == letra2){
                    cont_posicion++;
                }else{
                    esIgual=false;
                }
            }
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}
//
//if(cadena1.toLoweCase().equals(cadena2.toLowerCase())){
//        System.out.println("Son iguales");
//        }else{
//                System.out.println("No son iguales");
//
//        }