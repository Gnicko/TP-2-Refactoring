package refactor;

public class LibrosInfantlies extends Libro {
    public LibrosInfantlies(String nombre) {
        super(nombre);
    }

    @Override
    public double obtenerMontoLibro(int diasAlquilados) {
        double monto = 1.5;
        if (diasAlquilados > 3) {
            monto += (diasAlquilados - 3) * 1.5;
        }
        return monto;
    }

    public int calcularPuntosFrecuentes(int diasAlquilados) {
        return 1;
    }

}
