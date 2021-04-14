package refactor;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public double calcularMontoAlquiler() {
        return copia.calcularMontoCopiaLibro(diasAlquilados);
    }

    public int calcularPuntosFrecuentesAlquiler() {
        return copia.calcularPuntosFrecuentesCopiaLibro(diasAlquilados);
    }
}
