package interfaces13y14;

import java.util.Comparator;

public class comparadorNombre implements Comparator {
    public int compare (Object n1, Object n2){
        Futbolista futbolista= (Futbolista) n1;
        Futbolista futbolista2= (Futbolista) n2;
        return futbolista.getNombre().compareTo(futbolista2.getNombre());
    }
}
