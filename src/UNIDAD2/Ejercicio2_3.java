package UNIDAD2;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        System.out.println("di tus tres nÚmeros favoritos");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("di su número de la lotería (son 5 números)");
        int loteria = sc.nextInt();

        int cont=0;
        int ultimonum;

        while(loteria>0) {
            ultimonum = loteria % 10;
            if (ultimonum == num1 || ultimonum == num2 || ultimonum == num3) {
                cont++;
            }
            loteria /= 10;
        }
        if(cont>=3){
            System.out.println("Su número le dará suerte");
        }else{
            System.out.println("Su número no le dará suerte");
        }
    }
}
