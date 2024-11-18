package UNIDAD1.boletin3;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Double din;
        Double ref;
        String invitar = "si o no";
        System.out.println("¿Cuanto dinero tienes para gastar?");
        Scanner sc = new Scanner(System.in);
        din = sc.nextDouble();


        System.out.println("¿Cuanto cuesta un refresco?");
        ref = sc.nextDouble();


        System.out.println("Empieza a invitar");
        din = sc.nextDouble();


        switch (invitar) {
            case "caso1":
                System.out.println("¿Quieres invitar a Juan?");
                din = sc.nextDouble();
                din = din - ref;
                System.out.println("Te quedan " + din + "euros para gastar");
            case "caso 2":
                System.out.println("¿Quieres invitar a Hugo?");
                din = sc.nextDouble();
                din = din - ref - ref;
                System.out.println("Te quedan " + din + "euros para gastar");
            case "caso 3":
                System.out.println("¿Quieres invitar a Carmelo?");
                din = sc.nextDouble();
                din = din - ref - ref - ref;
                System.out.println("Te quedan " + din + "euros para gastar");
            case "caso 4":
        }


    }
}