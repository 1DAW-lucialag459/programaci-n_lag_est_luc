package interfaces13y14;

import java.util.Objects;

public class Futbolista implements Comparable {//implements Comparable{
         private String dni;
         private String nombre;
         private int edad;
         private int numeroGoles;

         public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
             this.dni = dni;
             this.nombre = nombre;
             this.edad = edad;
             this.numeroGoles = numeroGoles;
         }

    @Override
    public String toString() {
        return "Futbolista: " + '\n'+ "el dni es = " + dni + '\n' + "su nombre es = " + nombre + '\n' +
                "la edad es = " + edad + '\n' + "numero de goles = " + numeroGoles + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return dni == that.dni && numeroGoles == that.numeroGoles && Objects.equals(dni, that.dni) && Objects.equals(nombre, that.nombre);
    }

    public int compareTo(Object o){
             Futbolista futbolista = (Futbolista) o;
             return this.dni.compareTo(futbolista.dni);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }
}

