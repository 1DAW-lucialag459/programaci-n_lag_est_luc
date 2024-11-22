package UNIDAD2.Diapositivas;
import java.util.Scanner;

public class string5 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Dime una frase que le vamos a dar la vuelta");
            String frase= sc.nextLine();
            String frase2="";

            for(int i=(frase.length()-1); i>=0;i--){
                frase2+=frase.charAt(i);



            }
            System.out.println(frase2);
        }
    }

