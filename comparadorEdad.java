package interfaces13y14;

import java.util.Comparator;

public class comparadorEdad implements Comparator {
    public int compare (Object e1, Object e2){
        Futbolista futbolista= (Futbolista) e1;
        Futbolista futbolista2= (Futbolista) e2;
        return futbolista.getEdad() - futbolista2.getEdad();
    }
}
