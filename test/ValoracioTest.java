import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValoracioTest {

    private TipusValoracio tipusTest;
    private Videojoc videojocTest;
    private Usuari usuariTest;
    private Valoracio valoracioTest;

    @BeforeEach
    void setUp() {
        tipusTest = new TipusValoracio("valoració de prova", true);
        videojocTest = new Videojoc("Videojoc de prova");
        usuariTest = new Usuari("Usuari de prova");
        valoracioTest = new Valoracio(tipusTest, videojocTest, usuariTest);
    }

    @Test
    void getTipus() {
        assertEquals(tipusTest, valoracioTest.getTipus());
    }

    @Test
    void getVideojoc() {
        assertEquals(videojocTest, valoracioTest.getVideojoc());
    }

    @Test
    void getUsuari() {
        assertEquals(usuariTest, valoracioTest.getUsuari());
    }
}