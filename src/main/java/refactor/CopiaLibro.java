package refactor;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public double calcularMontoCopiaLibro(int diasAlquilados) {
        return libro.obtenerMontoLibro(diasAlquilados);
    }

    public int calcularPuntosFrecuentesCopiaLibro(int diasAlquilados) {
        return libro.calcularPuntosFrecuentes(diasAlquilados);
    }
}