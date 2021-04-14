package refactor;

public class LibrosNuevosLanzamientos extends Libro {
    public LibrosNuevosLanzamientos(String nombre) {
        super(nombre);
    }

    @Override
    public double obtenerMontoLibro(int diasAlquilados) {
        return diasAlquilados * 3;
    }

    public int calcularPuntosFrecuentes(int diasAlquilados) {
        if (diasAlquilados > 1)
            return 2;
        return 1;
    }
}
