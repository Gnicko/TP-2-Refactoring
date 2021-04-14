package refactor;

public class LibrosRegulares extends Libro {
    public LibrosRegulares(String nombre) {
        super(nombre);
    }

    @Override
    public double obtenerMontoLibro(int diasAlquilados) {
        double monto = 2;
        if (diasAlquilados > 2) {
            monto += (diasAlquilados - 2) * 1.5;
        }
        return monto;
    }

    public int calcularPuntosFrecuentes(int diasAlquilados) {
        return 1;
    }
}

