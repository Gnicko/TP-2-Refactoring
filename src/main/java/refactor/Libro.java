package refactor;

public abstract class Libro {

    private String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    public abstract double obtenerMontoLibro(int diasAlquilados);

    public abstract int calcularPuntosFrecuentes(int diasAlquilados);
}
