package UNIDAD1.boletin4;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        int segundosmas;
        System.out.println("Introduzca la hora: ");
        Scanner sc = new Scanner(System.in);
        horas = sc.nextInt();


        System.out.println("Introduzca los minutos: ");
        minutos = sc.nextInt();


        System.out.println("Introduzca los segundos: ");
        segundos = sc.nextInt();


        System.out.println("Introduzca cuantos segundos quieres aumemtar: ");
        segundosmas = sc.nextInt();


        System.out.println("Aumentando la hora...");
        segundos += segundosmas;
        while (segundos>=60){
            segundos -= 60;
            segundos++;
        }
        while (minutos>=60){
            minutos -= 60;
            minutos++;
        }
        horas%=24;
        System.out.println(horas + minutos + segundos);
    }
}


