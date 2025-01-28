import java.util.Arrays;

public class Libro {
    private String autor;
    private String titulo;
    private int ejemplaresVendidos;
    private Libro secuela;
    private Libro precuela;

    public Libro(String autor, String titulo) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String obtenerInformacion() {
        return "El nombre de la pelicula es " + this.titulo + "el autor es " + this.autor;
    }

    void añadirSecuela(Libro precuela) {
        precuela.secuela = this;
        this.precuela = precuela;
    }

    public String obtenerTituloPrecuela() {
        if (this.precuela == null) {
            System.out.println("La pelicula " + this.titulo + "no tiene precuela");
        } else {
            System.out.println("La precuela de la pelicula " + this.titulo + "es" + this.precuela);

        }
    }

    public void registrarVenta(int ejemplaresVendidos){
        this.ejemplaresVendidos = ejemplaresVendidos;
    }


    public String obtenerTituloSecuela (){
        if(this.secuela == null){
            System.out.println("La pelicula " + this.titulo +"no tiene secuela");
        }else{
            System.out.println("La secuela de la pelicula " + this.titulo + "es" + this.secuela);

        }
    }

    public void mostrarResumenSaga(){
        Libro 

    }
    public Libro[] obtenerSaga (){
        Libro[] saga = new Libro[1];
        Libro i = this;
        if (i.precuela != null){
            do{
                i=i.precuela;
            }while(i.precuela != null);
            saga[0]= i;
        }else{
            saga[0]=i;
        }
        if(i.secuela != null){
            do{
                saga= Arrays.copyOf(saga,saga.length+1);
                i=i.secuela;
                saga[saga.length-1]=i;
            }while(i.secuela!=null);

        }

        return saga;
    }
    void añadirPrecuela (Libro secuela){
        secuela.precuela = this;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(String autor) {
        return autor;
    }

    public String setTitulo(String titulo) {
        return titulo;
    }

    public String setAutor(String Autor) {
        return autor;
    }

    public int getEjemplaresVendidos(int ejemplaresVendidos) {
        return ejemplaresVendidos;
    }

    public int setEjemplaresVendidos(int ejemplaresVendidos){
        this.ejemplaresVendidos = ejemplaresVendidos;
    }

    public Libro getSecuela(){
        return secuela;
    }

}
