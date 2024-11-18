package UNIDAD2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Elige que opción quieres: 1. Area / 2.Volumen");
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();

        System.out.println("Inserte el radio de la base");
        double radio = sc.nextInt();

        System.out.println("Inserte el volumen de la base");
        double volumen = sc.nextInt();
        areavolumen(radio,volumen,opc);

    }

    public static void areavolumen(double radio, double altura, int opc) {
            if (opc == 1){
                System.out.println("El area es  " + Math.PI*radio*2);
            }else if(opc==2){
                System.out.println("El volumen es  " + Math.PI*(radio*radio)*altura);
            }else{
                System.out.println("Eso no es ni el area ni la altura, vuelve a introducir un número");
            }
    }
}