package UNIDAD2.Bolet1;

import java.util.Scanner;
public class ej4_java {
    public static void main(String[] args) {
        int sueldoBase1 = 0;
        int sueldoBase2 = 0;
        int sueldoBase3 = 0;
        int sueldoBruto = 0;
        int retencionIRPF = 0;

        System.out.println("¿Cual es el cargo del empleado? 1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto");
        Scanner sc = new Scanner(System.in);
        int cargo = sc.nextInt();

        System.out.println("¿Cuantos dias has estado visitando a clientes este mes?");
        int viaje = sc.nextInt();

        System.out.println("¿Cual es tu estado civil? 1 - Soltero, 2 - Casado");
        int estado = sc.nextInt();

        System.out.println("--------------------------");
        if (cargo == 1){
            System.out.println(" | Sueldo base       950 | ");
            sueldoBase1 = sc.nextInt();
        }else if (cargo == 2){
            System.out.println(" | Sueldo base      1200 | ");
             sueldoBase2 = sc.nextInt();
        }else if (cargo==3){
            System.out.println(" | Sueldo base      1600 | ");
              sueldoBase3 = sc.nextInt();
        }
        int dineroViaje = viaje * 30;
            System.out.println(" | Dietas (" + viaje + " viajes)  " + dineroViaje + " |" );
        System.out.println("--------------------------");


        if(cargo == 1){
          sueldoBruto = sueldoBase1 + dineroViaje;
                    System.out.println("Sueldo bruto     " + sueldoBruto);
        }else if (cargo == 2){
           sueldoBruto = sueldoBase2 + dineroViaje;
          System.out.println("Sueldo bruto     " + sueldoBruto);
        }else if (cargo == 3) {
            sueldoBruto = sueldoBase3 + dineroViaje;
            System.out.println("Sueldo bruto     " + sueldoBruto);
        }
        if (estado == 1){
             retencionIRPF = sueldoBruto * 25/100;
            System.out.println("Retención IRPF (25%) " + retencionIRPF);
        }else if (estado == 2)
             retencionIRPF = sueldoBruto * 20/100;
        System.out.println("Retención IRPF (20%) " + retencionIRPF);
        System.out.println("--------------------------");


        int sueldoFinal = sueldoBruto - retencionIRPF;
        System.out.println(" | Sueldo neto     " + sueldoFinal + "|");
        System.out.println("--------------------------");
    }
}
