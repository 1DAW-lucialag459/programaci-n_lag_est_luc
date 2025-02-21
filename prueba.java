package interfaces13y14;

import java.util.Arrays;
import java.util.Comparator;

public class prueba {
        public static void main(String[] args){
            Futbolista[] futbolistas = new Futbolista[5];
            futbolistas[0]=new Futbolista("123A", "Lucia", 25, 110);
            futbolistas[1]=new Futbolista("456B", "Pablo", 21, 150);
            futbolistas[2]=new Futbolista("789C", "Hugo", 28, 220);
            futbolistas[3]=new Futbolista("321D", "Javier", 15, 152);
            futbolistas[4]=new Futbolista("654E", "David", 19, 186);
            System.out.println("Ordenado por dni: ");
            Arrays.sort(futbolistas);
        for(Futbolista f:futbolistas){
            System.out.println(f);
        }
            System.out.println("Ordenado por edad: ");
        comparadorEdad ce = new comparadorEdad();
            Arrays.sort(futbolistas,ce);
            for(Futbolista f2:futbolistas){
                System.out.println(f2);
            }

            System.out.println("Ordenado por nombre: ");
            comparadorNombre ce2 = new comparadorNombre();
            Arrays.sort(futbolistas,ce2);
            for(Futbolista f3 : futbolistas){
                System.out.println(f3);
            }


            Arrays.sort(futbolistas, new Comparator() {
                public int compare(Object o1, Object o2) {
                    Futbolista futbolista =(Futbolista) o1;
                    Futbolista futbolista2 =(Futbolista) o2;
                    return futbolista.getNumeroGoles() - futbolista2.getNumeroGoles();
                }
            });
            for(Futbolista f4 : futbolistas){
                System.out.println(f4);
            }
        }
    }

