import org.junit.Test;
import refactor.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ClienteTest {
    @Test
    public void ClienteAlquilarTest() {
        Libro elTunel = new LibrosRegulares("El Túnel");
        Libro antesDelFin = new LibrosRegulares("Antes del Fin");

        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

        Cliente yo = new Cliente("Javier");

        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);

        assertArrayEquals(new Object[]{10.0, 2}, yo.calcularDeudaYPuntosObtenidos());
    }

    @Test
    public void ClienteAlquilarConBonusNuevoLanzamientoTest() {
        Libro elTunel = new LibrosRegulares("El Túnel");
        Libro antesDelFin = new LibrosNuevosLanzamientos("Antes del Fin");

        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

        Cliente yo = new Cliente("Javier");

        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);

        assertArrayEquals(new Object[]{15.5, 3}, yo.calcularDeudaYPuntosObtenidos());
    }
}
